package guia3;

import java.util.Scanner;

public class ejercicio8 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
        int tamanio = leer.nextInt();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (i == 0 || i == tamanio - 1 || j == 0 || j == tamanio - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

