
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int division1 = (n1 / 10);
        int division2 = (n2 / 10);
        int resultado = (n1 % 10) + (n2 % 10);
        int cifra = 0;
        while(resultado != 0){
            division1 /= 10;
            division /= 10;
            resultado += x + y + z;
            if (resultado > 7){
                resultado -= 8;
                z = 0;
                z++;
            }
            n1 /= 10;
            n2 /= 10;
        }
        return resultado;
    }
}
