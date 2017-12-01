import java.util.Scanner;
public class Ejercicio17{
  public static void main(String[]args){
    int numero1, nummero2, p,k, aux = 0;
    Scanner ingreso = new Scanner(System.in);

    System.out.println("Suma de dos numeros ");
    System.out.print("coloque un numero: ");
    
    numero1 = ingreso.nextInt();
    
    System.out.print("coloque el segundo numero: ");
      int numero2 = ingreso.nextInt();
   
    for(p = (numero1 + 1); p< numero2; p++){
      aux = aux + p;
    }

    for(k = (numero1 + 1); k < numero2; i++){
      if(k == (numero2 - 1)){
        System.out.print(k + " = ");
      }
      else{
        System.out.print(k + " + ");
      }
    }

    System.out.println(aux);
  }

}
