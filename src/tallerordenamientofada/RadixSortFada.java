package tallerordenamientofada;

// RadixSortFada 
import java.io.*;
import java.util.*;

class RadixSortFada {
    
	// Una función de utilidad para obtener el valor máximo en arr []
	static int getMax(int arr[], int n)
	{
            long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
		int mx = arr[0];
		for (int i = 1; i < n; i++){
			if (arr[i] > mx)
				mx = arr[i];
                }
                  TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
         tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
         System.out.println(" Tiempo de ejecución GetMax en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
          
		return mx;
	}

	// Una función para hacer el conteo tipo de arr [] según
	// el dígito representado por exp
	static void countSort(int arr[], int n, int exp)
	{
             long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
             TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
		int output[] = new int[n]; // matriz de salida
		int i;
		int count[] = new int[10];
		Arrays.fill(count,0);

		// Almacenar el recuento de apariciones en el recuento []
		for (i = 0; i < n; i++){
			count[ (arr[i]/exp)%10 ]++;
                }
		// Cambie la cuenta [i] de modo que la cuenta [i] ahora contenga
		// posición real de este dígito en la salida []
		for (i = 1; i < 10; i++){
			count[i] += count[i - 1];
                }
		// Construye la matriz de salida
		for (i = n - 1; i >= 0; i--)
		{
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
			count[ (arr[i]/exp)%10 ]--;
		}

		// Copia la matriz de salida a arr [], para que arr [] ahora
		// contiene números ordenados de acuerdo con el dígito actual
		for (i = 0; i < n; i++){
			arr[i] = output[i];
                }
                 TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
         tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
         System.out.println(" Tiempo de ejecución CountSort en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
          
	}

	// La función principal para eso ordena arr [] de tamaño n usando
	// RadixSortFada Sort
	static void radixsort(int arr[], int n)
	{
            long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
		// Encuentra el número máximo para saber la cantidad de dígitos
		int m = getMax(arr, n);

		// Haga el conteo ordenado para cada dígito. Tenga en cuenta que en cambio
		// de pasar el número de dígito, exp se pasa. exp es 10 ^ i
		// donde esta el número de dígito actual
		for (int exp = 1; m/exp > 0; exp *= 10)
			countSort(arr, n, exp);
                
         TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
         tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
         System.out.println(" Tiempo de ejecución MetodoRadixSort en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
          
	}

	// Una función de utilidad para imprimir una matriz
	static void print(int arr[], int n)
	{
            long TInicio, TFin, tiempo; //Variables para determinar el tiempo de ejecución
    TInicio = System.currentTimeMillis(); //Tomamos la hora en que inicio el algoritmo y la almacenamos en la variable inicio
        
		for (int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
             System.out.println();   
         TFin = System.currentTimeMillis(); //Tomamos la hora en que finalizó el algoritmo y la almacenamos en la variable T
         tiempo = TFin - TInicio; //Calculamos los milisegundos de diferencia
         System.out.println(" Tiempo de ejecución RadixSortprint en milisegundos: " + tiempo); //Mostramos en pantalla el tiempo de ejecución en milisegundos
           
	}

}