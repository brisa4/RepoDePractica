package guia2;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args){  
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   String frase;
   System.out.println("ingrese una frase:");
   frase = leer.next(); 
   System.out.println(frase.toUpperCase());
   System.out.println(frase.toLowerCase());
  }
}