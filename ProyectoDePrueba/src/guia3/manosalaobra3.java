package guia3;

import java.util.Scanner;

public class manosalaobra3 {
  public static void main(String[] args){   
  Scanner input = new Scanner(System.in);  
  double nota ; 
  do {
      System.out.println("ingrese una nota (entre 0 y 10) :");
      nota = input.nextDouble();
  } while (nota < 0 || nota > 10);
  System.out.println("la nota es" + nota );
  }
}