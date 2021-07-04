package batalhanaval;

import java.util.Random;

public class Tabuleiro 
{
    int[][] matrizJogador = new int[10][10];
    int[][] matrizPC      = new int[10][10];
    int[] naviosPontuacao = new int[4];
    int[] qtsAcertos      = new int[4]; 
    
    Random r = new Random();
    public Tabuleiro()
    {
        for (int j = 0; j < Alvos.BARCOS.length; j++)
            for (int k = 0; k < Alvos.QUANTIDADE[j]; k++) 
                if (r.nextBoolean())
                {
                    boolean naoDeu;
                    int row, col;
                    do
                    {
                        naoDeu = false;
                        row = r.nextInt(10);
                        col = r.nextInt(11 - Alvos.BARCOS[j]);

                        for (int i = 0; i < Alvos.BARCOS[j]; i++)
                            if (matrizJogador[row][col + i] != 0)
                                naoDeu = true;
                    } while (naoDeu);
                    
                    for (int i = 0; i < Alvos.BARCOS[j]; i++)
                        matrizJogador[row][col + i] = Integer.parseInt((i + 1) + "" + Alvos.BARCOS[j] + 0);
                }
                
                else
                {
                     boolean naoDeu;
                    int row, col;
                    do
                    {
                        naoDeu = false;
                        col = r.nextInt(10);
                        row = r.nextInt(11 - Alvos.BARCOS[j]);

                        for (int i = 0; i < Alvos.BARCOS[j]; i++)
                            if (matrizJogador[row + i][col] != 0)
                                naoDeu = true;
                    } while (naoDeu);
                    
                    for (int i = 0; i < Alvos.BARCOS[j]; i++)
                        matrizJogador[row + i][col] = Integer.parseInt((i + 1) + "" + Alvos.BARCOS[j] + 1);
                }
                
        for (int j = 0; j < Alvos.BARCOS.length; j++)
            for (int k = 0; k < Alvos.QUANTIDADE[j]; k++) 
                if (r.nextBoolean())
                {
                    boolean naoDeu;
                    int row, col;
                    do
                    {
                        naoDeu = false;
                        row = r.nextInt(10);
                        col = r.nextInt(11 - Alvos.BARCOS[j]);

                        for (int i = 0; i < Alvos.BARCOS[j]; i++)
                            if (matrizPC[row][col + i] != 0)
                                naoDeu = true;
                    } while (naoDeu);
                    
                    for (int i = 0; i < Alvos.BARCOS[j]; i++)
                        matrizPC[row][col + i] = Integer.parseInt((i + 1) + "" + Alvos.BARCOS[j] + 0);
                }
                
                else
                {
                     boolean naoDeu;
                    int row, col;
                    do
                    {
                        naoDeu = false;
                        col = r.nextInt(10);
                        row = r.nextInt(11 - Alvos.BARCOS[j]);

                        for (int i = 0; i < Alvos.BARCOS[j]; i++)
                            if (matrizPC[row + i][col] != 0)
                                naoDeu = true;
                    } while (naoDeu);
                    
                    for (int i = 0; i < Alvos.BARCOS[j]; i++)
                        matrizPC[row + i][col] = Integer.parseInt((i + 1) + "" + Alvos.BARCOS[j] + 1);
                }
    }
    
    public int getConteudo(int y, int x, QuemClicou q)
    {
        if (q == QuemClicou.Player)
            return matrizJogador[y][x];
        else
            return matrizPC[y][x];
    }
    
    public void setConteudo(int y, int x, int n, QuemClicou q)
    {
        if (q == QuemClicou.Player)
            matrizJogador[y][x] = n;
        if (q == QuemClicou.CPU)
            matrizPC[y][x] = n;
    }
    
    public boolean gerenciaPontuacao(int x, int y, String barco, QuemClicou q)
    {
        int tamanhoBarco = Integer.parseInt(barco.charAt(1) + ""),
            posAtual     = Integer.parseInt(barco.charAt(0) + ""),
            direcao      = Integer.parseInt(barco.charAt(2) + "");
        
        //Barco está na horizontal
        if (direcao == 0)
        {
            int inicioBarco = x - (posAtual - 1);
            for (int i = 0; i < tamanhoBarco; i++)
                if ((inicioBarco + i) != x)
                    if (getConteudo(y, inicioBarco + i, q) != -1)
                        return false;
            
            return true;
        }
        else
        {
            int inicioBarco = y - (posAtual - 1);
            for (int i = 0; i < tamanhoBarco; i++)
                if ((inicioBarco + i) != y)
                    if (getConteudo(inicioBarco + i, x, q) != -1)
                        return false;
            
            return true;
        }
    }
}
