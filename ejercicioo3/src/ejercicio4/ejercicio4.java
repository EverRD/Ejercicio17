package ejercicio4;
import java.util.Scanner;
public class ejercicio4 {
    public static  void main(String[]args){
        
        Scanner obtener = new Scanner(System.in);
        System.out.println("coloque el numero que va a invertir");
       
        int num = obtener.nextInt();
        if (num > 100 & num < 1000){
            int a = num / 1000;
            int e = num - (a * 1000);
            int i = e / 100;
            int o = e - (i * 100);
            int u= o / 10;
            int x = o - (e * 10);
            int z = (x*100) + (e * 100) + ( i * 10 ) +a;
            System.out.println("numeor invertido es " + z);
        }
    }
}
