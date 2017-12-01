mport java.util.Scanner;

import java.util.Scanner;

public class Eejercicioo6{
  public static void main(String[]args){
    Scanner ingreso = new Scanner(System.in);
    int cata, catb, sumacts;
    double hipotenusa;
    
    System.out.print("coloque el primer cateto: ");
    cata = ingreso.nextInt();
    System.out.print("coloque el segundo cateto: ");
    catb = ingreso.nextInt();
    
    cata = catea * cata;
    catb = catb * catb;
    sumacts = cata + catb;
    hipotenusa = Math.sqrt(sumacts);
    
    System.out.println("Su hipotenusa es: "+ hipotenusa);
    
  }//fin main
}//fin class