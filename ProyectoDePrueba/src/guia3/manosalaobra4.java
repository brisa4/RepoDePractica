package guia3;

import java.util.Scanner;

public class manosalaobra4 {
  public static void main(String[] args){   
  Scanner input = new Scanner(System.in);   
  int numero ;
  int suma = 0;
  
  for (int i=1 ; i <= 20; i++){
      System.out.println("introduce un numero" +i );
      numero = input.nextInt();
      if (numero==0){
       System.out.println("se capturo el numero cero"  );  
       break;
    }
      if (numero>0){
      suma += numero;
   }
   } 
  System.out.println("suma de los numero positivo es :" + suma ); 
  }
}