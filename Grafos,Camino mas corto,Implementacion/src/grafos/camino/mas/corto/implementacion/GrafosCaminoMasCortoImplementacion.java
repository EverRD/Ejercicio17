/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.camino.mas.corto.implementacion;

/**
 *
 * @author eve_l
 */
public class GrafosCaminoMasCortoImplementacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        long matrizA[][]={{0,3,4,9999999,8,99999999},0}};
       caminosMinimos ruta= new  caminosMinimos();
       system.out.println(ruta.algoritmoFloyd(marizA));
    }
    
}
