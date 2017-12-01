package InvertirNumero;
import java.util.Scanner;
public class InvertirNumero {
    public static  void main(String[]args){
        Scanner obtener = new Scanner(System.in);
        
        System.out.println(" ingrese los numeros ");
        
        int num = obtener.nextInt();
        
        if (num > 100 & num < 1000){
           
            int a = num / 1000;
            int e = num - (a * 1000);
            int i = a / 100;
            int o = e - (i*100);
            int u= a/ 10;
            int v = o - (e * 10);
            int w = (v*100) + (e * 100) + ( i* 10 ) +a;
            System.out.println(" numero invertido es " + g);
        }
    }
}
