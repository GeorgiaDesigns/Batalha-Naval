package batalhanaval;

enum Sentido { Vertical, Horizontal };

public class Alvos 
{
    //Tamanho dos tipos de barcos disponíveis
    public static final int[] BARCOS       = { 5, 4, 3, 2 };
    
    //Quantidade do barco de mesmo indíce no array de BARCOS
    public static final int[] QUANTIDADE   = { 1, 2, 3, 4 };
    
    //Pontuação de cada barco
    public static final int[] PONTOS_BARCO = { 4, 3, 2, 1 };
    
    public static int qualBarco(char c)
    {
        if (c == '2')
            return 3;
        if (c == '3')
            return 2;
        if (c == '4')
            return 1;
        
        return 0;
    }
}
