package Interfaz;

import java.util.Random;

import javax.swing.JButton;

public class BusquedaBinariaRecursiva {

	public static void main(String[] args) {
		
	}
	 public static int busquedaBinariaRecursiva(int[] arreglo, int busqueda, int izquierda, int derecha){
		 
	        // Si izquierda es mayor que derecha significa que no encontramos nada
	        if(izquierda > derecha){
	            return -1;
	        }
	 
	        // Calculamos las mitades...
	        int indiceDelElementoDelMedio = (int) Math.floor((izquierda + derecha) / 2);
	        int elementoDelMedio = arreglo[indiceDelElementoDelMedio];
	 
	        // Ver si está en la mitad
	        if(elementoDelMedio == busqueda){
	            return indiceDelElementoDelMedio;
	        }
	        // Si no, entonces vemos si está a la izquierda o derecha
	 
	        if(busqueda < elementoDelMedio){
	            derecha = indiceDelElementoDelMedio - 1;
	            return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	        }else{
	            izquierda = indiceDelElementoDelMedio + 1;
	            return busquedaBinariaRecursiva(arreglo, busqueda, izquierda, derecha);
	        }
	    }

}
