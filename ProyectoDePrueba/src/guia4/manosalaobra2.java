package guia4;

import java.util.Scanner;

public class manosalaobra2 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        EsMultiplo(num1, num2);
    }
public static void EsMultiplo(int num1, int num2) {
        if (num1 < num2) {
            if (num2 % num1 == 0) {
                System.out.println("El primer número es múltiplo");
            } else {
                System.out.println("El primer número NO es múltiplo");
            }
        } else if (num1 == num2) {
            System.out.println("Los números son iguales, por lo que si son múltiplos");
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El segundo número es múltiplo");
            } else {
                System.out.println("El segundo número NO es múltiplo");
            }
        }
    }
}
