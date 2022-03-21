package algoritmos;

public class algortimos {
	

	//@autor landeron 
	
	
	
	public static void Radix (int [] arreglo) {
		int x,i,j;
		for (x=Integer.SIZE-1;x>=0;x--)//32 cadenas de digitos a comparar desde el ultimo al primero
		{
			System.out.print(x+" ");
			int [] aux=new int [arreglo.length];
			j=0;
			for (i=0;i<arreglo.length;i++)
			{
				boolean mover=arreglo[i]<< x >=0;
				System.out.println(mover+" "+i);
			/*	if (x==0? !mover:mover) {
					aux[j]=arreglo[i];
					j++;
				}else {
					arreglo[i-j]=arreglo[i];
				}
					*/
			}
		}
	}
	public int[] quicksort(int v[]) {
		
		  int i=v[0]; // i realiza la búsqueda de izquierda a derecha
		  int j=v[v.length-1]; // j realiza la búsqueda de derecha a izquierda
		  quickSort(v,i,j);
		return v;
		}
	
	 public void quickSort(int[] L_posicion, int Primero, int Ultimo)
     {
         int Menor, Mayor, Central;
         double Pivote;

         Central = (Primero + Ultimo) / 2;
         Pivote = L_posicion[Central];
         Menor = Primero;
         Mayor = Ultimo;
         
         while (Menor <= Mayor)
         {
             while (L_posicion[Menor] < Pivote) Menor++;
             while (L_posicion[Mayor] > Pivote) Mayor--;

             if (Menor <= Mayor)
             {
                 int temp;
                 temp = L_posicion[Menor];
                 L_posicion[Menor] = L_posicion[Mayor];
                 L_posicion[Mayor] = temp;
                 Menor++;
                 Mayor--;
             }
         } 

         if (Primero < Mayor)
         {
             quickSort(L_posicion, Primero, Mayor);
         }
         if (Menor < Ultimo)
         {
             quickSort(L_posicion, Menor, Ultimo);
         }
     }
	 
	 
	 public static void quicksort(int A[], int izq, int der) {

		  int pivote=A[izq]; // tomamos primer elemento como pivote
		  int i=izq; // i realiza la búsqueda de izquierda a derecha
		  int j=der; // j realiza la búsqueda de derecha a izquierda
		  int aux;
		 
		  while(i<j){            // mientras no se crucen las búsquedas
		     while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
		     while(A[j]>pivote) j--;         // busca elemento menor que pivote
		     if (i<j) {                      // si no se han cruzado                      
		         aux= A[i];                  // los intercambia
		         A[i]=A[j];
		         A[j]=aux;
		     }
		   }
		   A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
		   A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
		   if(izq<j-1)
		      quicksort(A,izq,j-1); // ordenamos subarray izquierdo
		   if(j+1 <der)
		      quicksort(A,j+1,der); // ordenamos subarray derecho
		}

	 
}
