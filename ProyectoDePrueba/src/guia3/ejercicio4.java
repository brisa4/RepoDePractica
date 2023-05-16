package guia3;

import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args){ 
  Scanner input = new Scanner(System.in); 
  System.out.println("ingrese una frase o palabra :");
  String frase= input.nextLine();     
  if (frase.substring(0,1).equals("A")|| frase.substring(0, 1).equals("a")){
  System.out.println("correcto:");
  } else {
      System.out.println("incorrecto:");
  }
  }
}