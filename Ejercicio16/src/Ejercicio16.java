import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[]args){
       
        Scanner ingreso = new Scanner(System.in);
        int num;
        
        System.out.println("potencia de 2");
        System.out.print("coloca un  numero: ");
        
        num = ingreso.nextInt();
        poten(num);     
    }

    public static void poten(int numero){
      int e;
      for(e = 1; e <= num; e++){
        
          System.out.println(e + "^2 = " + (int)(Math.pow(e,2)) );
      }
    }
   

}