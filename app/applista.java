package app;

import java.util.Scanner;

import lista_sencilla.lista;

public class applista {

	public static void main(String[] args) {
		
		lista l=new lista();
		Scanner n=new Scanner(System.in);
		boolean b = false;
		while(!(b))
		{
		switch (menu()) {
		case 0:
			int var=0;
			System.out.println(" cuantas claves deceas agregar? : ");
			var=n.nextInt();
			for (int i = 0; i <var; i++) 
				l.insertar(n.nextInt());
			break;
		case 1:
			System.out.println(" agrega una clave : ");
			l.insertar(n.nextInt());
			break;
			
		case 2:
			System.out.println(" busca una clave : ");
			l.Buscar(n.nextInt());
			break;
		case 3:
			System.out.println("toda la lista : ");
			l.Mostrarlista();
			
			break;
		case 4:
			System.out.println("Elimina una clave una clave : ");
			l.Eliminar(n.nextInt());
			break;
		
		case 5:
			System.out.println(" hasta la proxima");
			b=true;
			break;
		}
	}
		
}

	private static int menu() {
	 System.out.println("0. agregar muchos");
System.out.println("1. agregar");
System.out.println("2. buscar");
System.out.println("3. mostrar");
System.out.println("4. eliminar");
System.out.println("5. salir");
		
		 return new Scanner(System.in).nextInt();
	}

}
