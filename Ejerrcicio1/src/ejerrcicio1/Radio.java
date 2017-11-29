ackage programa;
import javax.swing.JOptionPane;

    public class Radio {
    public static void main(String []arg){
        Radio b;
        a= new Radio();
        a.lee();
        a.Calarea();
        a.imparea();
        a.calperimetro();
        a.imperimetro();
    }
    private float radio;
    private float perimetro;
    private float area;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getarea() {
        return area;
    }
    public void calculearea(){
        area= (float)(Math.PI * radio * radio);
    }
    public void calPerimetro(){
        perimetro = (float)(Math.PI * (2*radio));
    }
    public void imprimearea(){
        JOptionPane.showMessageDialog(null, "area es " + area);
    }
    public void imPerimetro(){
        JOptionPane.showMessageDialog(null, "el perimetro es " + perimetro);}

        public void lee(){
        radio= Float.parseFloat(JOptionPane.showInputDialog(null, "radio: "));
        }
}

