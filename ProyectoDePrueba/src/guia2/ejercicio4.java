package guia2;

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in);  
   System.out.println("ingrese la cantidad de grados centigrados:");
   double celsius = leer.nextDouble();
   double Fahrenheit = (9 * celsius / 5)+ 32 ;   
   System.out.println("el equivalente en grados fahrenheit es " + Fahrenheit);
  }
}