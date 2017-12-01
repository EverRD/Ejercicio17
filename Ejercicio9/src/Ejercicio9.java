import java.util.Scanner;
public class Ejercicio9{
  public static void main(String[]args){
   
      Scanner ingreso = new Scanner(System.in);
    int num;
   
    System.out.print("coloque un año: ");
    num = ingreso.nextInt();
   
    if(num %4 == 0)
    {
      System.out.println("su año es bisiesto");
    }
    else{
      System.out.println("su año no es bisiesto");
    }
   
  }
}
