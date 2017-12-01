import java.util.Scanner;

public class Ejercicioo3{
    public  static  void  main(String args[]){

        Scanner t = new Scanner(System.in);
        double valorpulg = 2.54;
        double cm,pulg;
        
        System.out.println("valor en centrimetros: ");
        cm = t.nextDouble();

        pulg = cm + valorpulg;
        System.out.println("resuktado en pulgadas es : " + pulg);
    }
}
