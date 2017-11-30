package paquete;
import javax.swing.*;
public class Promedio {
    public static void main(String[] arg){
        
        Double not1 = Double.parseDouble(JOptionPane.showInputDialog("escriba  el promedio de la primera nota "));
        Double not2 = Double.parseDouble(JOptionPane.showInputDialog("escriba  el promedio de la segunda nota "));
        Double not3 = Double.parseDouble(JOptionPane.showInputDialog("escriba el promedio de la tercera nota "));
        Double not4 = Double.parseDouble(JOptionPane.showInputDialog("escriba  el promedio de la cuarta nota"));
        
        Double prom=(not1+not2+not3+not4)/4;
        
        JOptionPane.showMessageDialog(null,"el resultado es " + prom);

    }
}
