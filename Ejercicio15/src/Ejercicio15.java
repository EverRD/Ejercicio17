import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[]args){
       
        Scanner ingreso = new Scanner(System.in);
        int num;
        
        System.out.print("coloque cuakquier  numero: ");
        num = ingreso.nextInt();
        Ejercicio15(num);
       
    }
    public static void Ejercicio15(int numero){
        int a;
        for(a = 1; a<=10; a++){
        System.out.printf
         ("%d x %d = %d\n",numero, a, (a * numero) );
        }
    }

}