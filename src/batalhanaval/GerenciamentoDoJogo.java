package batalhanaval;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

enum QuemClicou { CPU, Player };

public class GerenciamentoDoJogo
{    
    int pontosPlayer = 0,
        pontosCPU    = 0;
    
    Jogador j = new Jogador();
    
    public void cliqueMatriz(JButton b, Tabuleiro t, QuemClicou q) 
    {
        String nome = b.getName();
        int y = Integer.parseInt(nome.charAt(0) + ""),
            x = Integer.parseInt(nome.charAt(1) + "");
        int conteudo = t.getConteudo(y, x, q);
        
        if (conteudo == 0)
        {
            b.setIcon(new ImageIcon(getClass().getResource("/batalhanaval/explosao.jpg")));
            t.setConteudo(y, x, -1, q);
        }
        else if (conteudo != -1)
        {
            ImageIcon icon = new ImageIcon(getClass().getResource("/batalhanaval/" + conteudo + ".png"));
            
            BufferedImage resizedImg = new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = resizedImg.createGraphics();

            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2.drawImage(icon.getImage(), 0, 0, 40, 40, null);
            g2.dispose();
    
            b.setIcon(new ImageIcon(resizedImg));
             
            if (t.gerenciaPontuacao(x, y, t.getConteudo(y, x, q) + "", q))
            {
                if (q == QuemClicou.CPU)
                    pontosCPU += Alvos.PONTOS_BARCO[Alvos.qualBarco((t.getConteudo(y, x, q) + "").charAt(1))];
                  if(j.jaGanhou(pontosCPU))
                  {  
                      JOptionPane.showMessageDialog(null, "Você perdeu!");
                      System.exit(0);
                  }  
                    
                if (q == QuemClicou.Player)
                    pontosPlayer += Alvos.PONTOS_BARCO[Alvos.qualBarco((t.getConteudo(y, x, q) + "").charAt(1))];
                    if(j.jaGanhou(pontosPlayer))
                    {
                       JOptionPane.showMessageDialog(null, "Você ganhou!"); 
                       System.exit(0);
                    }
                    
            }
            t.setConteudo(y, x, -1, q);
        }
    }
    
    public String vezCPU(Tabuleiro t)
    {
        Random r = new Random(); 
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        
        while (t.matrizPC[x][y] == -1)
        {      
            x = r.nextInt(10);
            y = r.nextInt(10);
        }
       return x + "" + y + "p";
    }
    
    public int getPontosPlayer()
    {
        return pontosPlayer;
    }
    
    public int getPontosCPU()
    {
        return pontosCPU;
    }
}
