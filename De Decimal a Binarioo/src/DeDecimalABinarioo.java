import java.util.Stack;
    public class DeDecimalABinarioo {
	public  static  void main(String[]args){int n;
                n = 1234567889;
                int db;
		
                String x = "";
		Stack pila=new Stack();
		do{pila.add(db = n % 2);
		   
                x = db + x;
		   
                   n = n/2;}
                
                 while(n>0);
		
                System.out.println("de decimal a binario es: [ " + pila.push(x) + " ]");
	}	
}
