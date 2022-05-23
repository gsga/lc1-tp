package tup;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String linea;
        boolean valido = false;
        int numero;
        do {
            System.out.println("Ingresar un entero entre 3 y 5: ");
            linea = teclado.nextLine();
            numero = Integer.parseInt(linea);
            if (numero >= 3 && numero <= 5) {
                valido = true;
            } else {
                System.out.println("No válido. Ingresar un entero entre 3 y 5: ");
            }
        } while (!valido);
        System.out.println("Valor ingresado: " + numero);
        float[] miArray = new float[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("miArray[" + i + "]: ");
            miArray[i] = Float.parseFloat(teclado.nextLine());
        }

        Arrays.sort(miArray);

        for (int i = 0; i < numero; i++) {
            System.out.println("miArray[" + i + "]: " + miArray[i]);
        }

    }
}
