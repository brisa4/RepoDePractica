package guia3;

import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args){ 
  Scanner input = new Scanner(System.in); 
  System.out.println("ingrese una frase o palabra :");
  String frase= input.nextLine();   
  if (frase.length()==8){
  System.out.println("correcto:");
  } else {
      System.out.println("incorrecto:");
  }
  }
}