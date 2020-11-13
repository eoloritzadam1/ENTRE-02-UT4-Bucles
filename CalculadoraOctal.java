
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Elorri Oloritz
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
        int resto1 = 0;
        int resto2 = 0;
        int resultado = 0;
        int contador = 0;
        int c = 0;

        while(n1 != 0){
            resto1 = n1 % 10;
            resto2 = n2 % 10;
            int suma = resto1 + resto2 + c;
            int exponente = contador;
            c = 0;

            if (suma > 7){
                suma -= 8;
                c++;
            }

            while (exponente != 0){
                suma *= 10;
                --exponente;
            }

            n1 /= 10;
            n2 /= 10;
            resultado += suma;
            contador++;
        }

        for (int y = 0; y < contador; y++){
            c *= 10;
        }

        return resultado += c;
    }

}

