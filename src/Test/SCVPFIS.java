package Test;

import Clases.Calculadora;
import java.util.Scanner;

public class SCVPFIS {

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        int opc;
        int num1, num2;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\n*** MENÚ CALCULADORA ***\n");

            System.out.print("Introduzca operando 1: ");
            num1 = teclado.nextInt();

            System.out.print("Introduzca operando 2: ");
            num2 = teclado.nextInt();

            System.out.println("\n1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir del programa");
            System.out.print("Seleccione operación a realizar: ");
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + cal.suma(num1, num2));
                    break;

                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + cal.resta(num1, num2));
                    break;

                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + cal.multiplicacion(num1, num2));
                    break;

                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + cal.division(num1, num2));
                    break;

                default:
                    System.out.println("Error, el número introducido no corresponde a las ocpiones del menú");
            }
        } while (opc != 0);

        teclado.close();
    }
}
