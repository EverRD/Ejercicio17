import java.util.Scanner;
public class centimetrosapulgadas {
    public  static  void  main(String args[]){

        Scanner a = new Scanner(System.in);
        
        double pulgadas = 2.54;
        
        double cm,pulg;
        
        System.out.println("ingrresa tu valor");
        cm = a.nextDouble();

        pulg = cm + pulgadas;
        System.out.println("en pulgadas resultado es : " + pulg);
    }
}
