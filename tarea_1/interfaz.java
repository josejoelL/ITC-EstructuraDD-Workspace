package tarea_1;

import java.util.Scanner;
import java.util.Stack;

public class interfaz <t>{
	static Scanner n=new Scanner(System.in);
	
	public static void main(String[] args) {
	;
		Stack < Integer > pila =new Stack < Integer >();
		for(int i=0;i<5;i++) 
		{
			System.out.println("Agregue en el espacio "+(i+1)+" :");
			pila.push(n.nextInt());
			
		}
		
		System.out.println("su pila desordenada es :");mostrar(pila);
		ordenar(pila);
		System.out.println("su pila ordenada es :");mostrar(pila);
	}
	public static void mostrar(Stack<Integer> pila) {
		
			System.out.println( pila );
			/*for(int n=0;n<p.size();n++) {
			}
			*/
	}
	public static integer ordenar (Stack<interfaz> pila) {
		Integer aux=0;
		
		for (int i = 0; i < pila.length; i++) {
			if ( pila.top<= pila.pop){
				aux=pila.top;
				pila.pop();
				
				continue;
			}else{
				
			}
			
		}
				return pila.lastIndexOf(pila);
	}
}
