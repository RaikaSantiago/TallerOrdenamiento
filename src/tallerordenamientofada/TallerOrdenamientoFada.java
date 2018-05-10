
package tallerordenamientofada;

import java.util.Scanner;
import static tallerordenamientofada.RadixSortFada.radixsort;






public class TallerOrdenamientoFada {

    
    public static void main(String[] args) {
        

     //------------------------------------- RadixSort------------------------------------------   
      System.out.println("-------------------RadixSort---------------------------"); 
     RadixSortFada Radix1 =new RadixSortFada();
     int arr[] = {8789,3748,1223,7847,8434,4784,3948,2732,8349,2388,23782,62612,5885,6584,6230,2762,47374,2632,3243,5849,
         4374,38478,9323,2984,2383,1893,3484,3744,1091,23984,8558,7483,8347,170, 45, 75, 90, 802, 24, 2,4757,75894,2839,858, 
         66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 57435,8384,2845,5253,6896,52564,7632,9856,4752,8685,362,9283,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 78753,985,26353,8698,
         3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170,77688,4335,3224,
         45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 4456,7788,9876,
         8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26,3245,3456,8906, 
         934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802,667,1234,986,345, 
         24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 4465,7879,989,
         9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 345,45645,688,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456,1324,446,657,
         876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 889,2343,132,
         90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567,1224,5456,467, 
         216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567,43346,43467,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876,8473,4783, 
         467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24,4533,
         2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,3454,
         170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567,
         216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657,
         34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 
         1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 
         876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24,
         2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 
         45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216,
         9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 
         34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 
         1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 
         467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2,
         66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12, 45657};
       int n = arr.length;
       radixsort(arr, n);
       Radix1.print(arr, n);
       
    //----------------------------------------------RadixSort------------------------------------------  
    //----------------------------------------------QuickSort-----------------------------------------
      System.out.println("--------------------QuickSort---------------------------"); 
    int []arreglo = {8789,3748,1223,7847,8434,4784,3948,2732,8349,2388,23782,62612,5885,6584,6230,2762,47374,2632,3243,5849,
         4374,38478,9323,2984,2383,1893,3484,3744,1091,23984,8558,7483,8347,170, 45, 75, 90, 802, 24, 2,4757,75894,2839,858, 
         66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 57435,8384,2845,5253,6896,52564,7632,9856,4752,8685,362,9283,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 78753,985,26353,8698,
         3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170,77688,4335,3224,
         45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 4456,7788,9876,
         8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26,3245,3456,8906, 
         934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802,667,1234,986,345, 
         24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 4465,7879,989,
         9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 345,45645,688,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456,1324,446,657,
         876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 889,2343,132,
         90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567,1224,5456,467, 
         216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567,43346,43467,
         8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876,8473,4783, 
         467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24,4533,
         2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,3454,
         170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567,
         216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657,
         34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 
         1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 
         876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24,
         2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 
         45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216,
         9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 
         34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 467, 26, 934, 9876, 
         1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2, 66877, 567, 3456, 876, 
         467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12,170, 45, 75, 90, 802, 24, 2,
         66877, 567, 3456, 876, 467, 26, 934, 9876, 1, 4567, 8747, 5657, 34756, 8786, 4567, 216, 9534, 98776, 12, 45657};
    long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
        Quicksort o = new Quicksort();
        o.quicksort(arreglo, 0, arreglo.length-1);
        for (int i = 0; i < arreglo.length; i++) {
             System.out.print(arreglo[i] + " ");
             //System.out.println();
        }
        System.out.println();
         TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
         tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
         System.out.println(" Tiempo de ejecución QuickSort en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
          
     //----------------------------------------------QuickSort-----------------------------------------  



    }
}
    

