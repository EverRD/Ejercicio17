/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video51;

/**
 *
 * @author eve_l
 */
public class AlgoritimosDeOrdenamiento {
   int i,j,temporal;
   public AlgoritimosDeOrdenamiento (){
       this.i=0;
       this.j=0;
      this.temporal=0;
   }
   //metodo burbuja
   public void burbuja(int [] arreglo){
       for(i=0;i<arreglo.length;i++){
       for(j=i+1;j<arreglo.length;j++){
           if(arreglo[i]>arreglo[j]){
               temporal=arreglo[i]);
                arreglo[i]=arreglo[j]);
               arreglo[]=[j]temporal;
               
           }
           
       }
   }
   }       
               
     //meotodo burbuja version 2
   public void burbuja2(int [] arreglo){
      for(i=0;i<arreglo.length;i++){              
        for(j=i+1;j<arreglo.length-1;j++){      
        if(arreglo[j]>arreglo[j+1]){
            temporal=arreglo[j]);
            arreglo[j]=arreglo[j+1]);
               arreglo[]=[j+1]temporal;
               
        }
   }
}
   }
   
   //metodo Radix
   public void radix(int [] arreglo) {
       int x,i,j;
       for(x=Integer.SIZE-1;zx>=0;x++){
           int auxiliar[]=new int [arreglo.length];
           j= 0;
           for (i = 0; i < arreglo.length; i++){
               boolean mover = arreglo[i] <<x >=0;
               if(x==0?mover:mover:){
               auxiliar(j)=arreglo[i];
               j++;
           }else{
                   arreglo[i-j]=arreglo[i];
                            
               }
           }
           for(i=j;i<auxiliar.length;i++){
               auxiliar[i]=arreglo[i-j];
               
          }
           arreglo=auxiliar;
           
       }
       System.out.println("El arreglo ordenado con radix es:");
       
       mostrarArreglo (arreglo);
   }
   
//Mostrar los datos del vector 
   public void mostrarArreglo()(int [] arreglo){
    int k;
    for(k=0;k<arreglo.length;k++){
        System.out.println("["+arreglo[k]+"]");
        
    }
    System.out.println();
    
}
}


