package guia2;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in);
   String nombre;
   System.out.println("ingrese tu nombre:");
   nombre = leer.next();
   System.out.println("hola como estas " + nombre);
   }
}