package guia3;

import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args){ 
  Scanner input = new Scanner(System.in); 
  System.out.println("ingrese una frase :");
  String frase= input.nextLine (); 
  if (frase.equals("eureka")){
  System.out.println("correcto:");
  } else {
      System.out.println("incorrecto:");
  }
  }
}