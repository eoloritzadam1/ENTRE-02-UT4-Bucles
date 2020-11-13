import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Elorri Oloritz
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char s = 'S';
        int n1 = 0;
        int n2 = 0;
        while (s == 'S'){
            Pantalla.borrarPantalla();
            System.out.print("Teclee número1: ");
            n1 = teclado.nextInt();
            System.out.print("Teclee número2: ");
            n2 = teclado.nextInt();

            if (Utilidades.estaEnOctal(n1) == false || Utilidades.estaEnOctal(n2) == false){
                System.out.println("\nAlguno de los números no está en octal");
            }
            else if (Utilidades.contarCifras(n1) != Utilidades.contarCifras(n2)){
                System.out.println("\nNo tienen el mismo nº de cifras");
            }
            else {
                int suma = calculadora.sumarEnOctal(n1,n2);
                System.out.print("---------------------------------------\n");
                System.out.printf("\n%20d\n", n1);
                System.out.printf("%20d\n", n2);
                System.out.printf("%5s%9d\n", "Suma octal:", suma);
            }
            System.out.print("\nQuiere hacer otra suma en octal? (S/s)");
            teclado.nextLine();
            s = teclado.nextLine().charAt(0);
            Pantalla.borrarPantalla();
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        int altura = 0;
        
        System.out.print("Ahora se dibujará una figura");
        System.out.print("\nAltura de la figura? (1-10)\n");
        altura = teclado.nextInt();
        while (altura < 1 || altura > 10){
            System.out.print("Error, Altura de la figura? (1-10)\n");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }

}
