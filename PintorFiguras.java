
/**
 *  Clase que dibuja una figura 
 * 
 * @author - Elorri Oloritz
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
        // f = fila, c = columna, e = espacio
        
        int espacio = altura * 2 - 2;
        for (int f = 1; f <= altura; f++){
            escribirEspacios(ESPACIO, espacio);
            for (int c = 1; c <= f; c++){
                for (int e = 1; e <= ANCHO_BLOQUE; e++)
                if (c % 2 == 0){
                    System.out.print(CAR1);
                }
                else{
                    System.out.print(CAR2);
                }
                
            }
            espacio -= 2;
            System.out.println();
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        for(int e = 0; e < n; e++){
            System.out.print(caracter);
        }
    }
}
