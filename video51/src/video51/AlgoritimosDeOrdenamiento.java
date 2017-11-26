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
   //Metodo quick
   oublic void quick(int[] arreglo,int primero,int ultimo){
       int i,j,pivote,auxiliar;
       i=primero;
       j=ultimo;
       pivote=arreglo[primero+iultimo])/2];
       do{
           while(arreglo[i]<pivote)
               i++;
            }
          while(arreglo[j>pivote]){
            j--;
   
            }
         //aqui hacemos el intercambio
          if(i<=j){
              auxiliar=arreglo[i];
              arreglo[i]=arreglo[j];
              arreglo[j]=auxiliar;
              i++;
              j--;
              
          }
        }while(i<=j);
        if(primero<j){
       quick(arreglo, primero, j);
       
     }
        if(ultimo<j){
       quick(arreglo, i, ultimo);
               
       
   }
       
       mostrarArreglo(arreglo);
   }
   
  //Mtodo Para Insercion
public void insercion (int [] arreglo, int n}{
int i,j,auxiliar;
for(i=1;i<n;i++){
auxiliar=arreglo[i];
j=i-1;
while(j>=0 && rreglo[j>auxiliar]){
arreglo[j+1]=arreglo[j];
j=j-1;

      }
arreglo[j+1]=auxiliar;
    }
     System.out.println("arreglo orenado por insercion");
     mostrarArreglo(arreglo);


}

//metodo shell
public void shell(int[] arreglo){
int salto,i,j,k,auxiliar;
salto=arreglo.length/2;
while(salto>0){
for(i=salto;i<arreglo.length;i++){
j=i-salto;
while(j>=0){
k=j+salto;
if(arreglo[j]<=arreglo[k]){
j=-1;
}else{
auxiliar=arreglo[j];
arreglo[j]=arreglo[k];
arreglo[k]=auxiliar;
j-- salto;//j=j-salto

     }

   }
 }
  salto=salto/2;
}
System.out.println("arreglo otdenado con shell");
mostrar(arreglo);

}

//metodo intercalacion
public void intercalacion(int [] arregloA, int [] arregloB){
int i, j, k;
int arregloC[] = new int[arregloA.lengh + arregloB.lenght];
//repetir miestras los arreglos A Y B tengan elementos que comparar
for (i = j = k = 0; i < arregloA.lengh && j < arregloB.lengh; k++){
if (arregloA[i] < arregloB[j]){
arregloC[k] = arregloA[i];
i++
}else{
arregloC[k]=arregloB[j];
j++;
}
}
//para añadir arreglo C los elementos del arregloA sobrantes en caso de haberlo
for (; i < arregloA.length; i++, k++) {
arregloC[k] =arregloA[i];


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


