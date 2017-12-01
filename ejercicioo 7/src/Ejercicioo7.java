import java.util.Scanner;
public class Ejercicioo7{
  public static void main(String[]args){
    
      Scanner ingreso = new Scanner(System.in);
    int num;
   
    System.out.print("Ingresa un numero: ");
    num= ingreso.nextInt();
   
    if(num % 2 == 0){
      System.out.println("el numero que ingreso es par");
    }
    else{
      System.out.println("el numero que ingreso es impar");
    }
   
  }
}