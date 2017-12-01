import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[]args){
    
    Scanner ingreso = new Scanner(System.in);
    double nreal, ndecimal;
    int nrealEntero;
   
    System.out.print("ingresar el numero real: ");
    nreal = ingreso.nextDouble();
    nrealEntero = (int)nreal;
    ndecimal = nreal - nrealEntero;
   
    System.out.printf("la parte decimal es: %f\n", ndecimal);
   
  }
}