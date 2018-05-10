
package tallerordenamientofada;





public class TallerOrdenamientoFada {

    
    public static void main(String[] args) {
        
        int []arreglo = {8789,3748,1223,7847,8434,4784,3948,2732,8349,2388,23782,62612,5885,6584,6230,2762,47374,2632,8473,4783,
                         4374,38478,9323,2984,2383,1893,3484,3744,1091,23984,8558,7483,8347};
        Quicksort o = new Quicksort();
        o.quicksort(arreglo, 0, arreglo.length-1);
        for (int i = 0; i < arreglo.length; i++) {
             System.out.print(arreglo[i] + " ");
             System.out.println();
        }
       


    }
}
    

