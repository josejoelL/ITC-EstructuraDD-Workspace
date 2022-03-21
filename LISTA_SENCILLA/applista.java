package LISTA_SENCILLA;

public class applista {

	public static void main(String[] args) {
		
		
		
		lista l=new lista();
		l.insertar(12);
		l.insertar(3);
		l.insertar(20);
		l.insertar(1);
		l.insertar(31);
		l.insertar(15);
		l.insertar(25);
		
	/*
		l.insertar(5,"sienseña");
		l.insertar(4,"ceceña");
		l.insertar(3,"maricarmen");
		l.insertar(2,"manuel");
		l.insertar(1,"juan");
	*/
		/*
		l.insertar(1,"juan");
		l.insertar(2,"manuel");	
		l.insertar(3,"maricarmen");
		l.insertar(4,"ceceña");
		l.insertar(5,"sienseña");
		*/
		/*
		l.insertar(1,"juan");
		l.insertar(5,"sienseña");
		l.insertar(4,"ceceña");
		l.insertar(2,"manuel");	
		l.insertar(3,"maricarmen");
		*/
		//sí elimino el 1 se elimina el 5 tambien
		//sí elimino el 2 se elimina el 5 y el 2 no
		//sí elimino el 3 se elimina el 5 y el 3 no
		//sí elimino el 4 se elimina el 5 y el 4 no
		//sí elimino el 6 se elimina el 5 
		//sí elimino el 5 se elimina
		//si no utilizo el metodo borrar de igual forma se elimina el 5
		//el problema es con el final
		//el problema no es con el final
		//el problema es con el existe
		//se corrigio el error de borrar el 5
		
		//ahora ya no funciona el borrar 
		//sí borro el 5 se traba al imprimirlo
		//si elimino las claves del medio igual las imprime
		//si elimino el del inicio al imprimirlo se me traba el programa
		l.Eliminar(1);
	//	l.Eliminar(4);
	//	l.Eliminar(5);
	//l.Eliminar(5);
		l.Mostrar(1);
		l.Mostrar(2);
		l.Mostrar(3);
		l.Mostrar(4);
		l.Mostrar(5);
		
		
	}

}
