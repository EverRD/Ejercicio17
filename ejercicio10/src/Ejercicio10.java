import java.util.Scanner;
public class Ejercicio10{
  public static void main(String[]args){
   
      Scanner ingreso = new Scanner(System.in);
    int divid, ndivisor;
   
    System.out.print("coloque el n dividendo: ");
    divid = ingreso.nextInt();
   
    System.out.print("coloque  el n divisor: ");
    ndivisor = ingreso.nextInt();
   
    if(divid % ndivisor == 0){
      System.out.println("su division es exacta");
    }
    else{
      System.out.println("su division no es exacta");
    }
  }
}