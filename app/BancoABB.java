package app;

import java.util.Scanner;

import arbol_binario.ArbolBinarioBusqueda;
import lista_sencilla.lista;
import objeto_nodo.CLienteBanco;

public class BancoABB {

	public static void main(String[] args) {
		ArbolBinarioBusqueda<CLienteBanco> Sistema = new ArbolBinarioBusqueda<CLienteBanco>();
		Scanner Teclear = new Scanner(System.in);
		boolean b = false;
		while (!(b)) {
			switch (menu()) {
			
			case 1:
				System.out.println("Ingrese  ID : ");
				int id=Teclear.nextInt();
				System.out.print("Ingrese nombre: ");
				String nombre=Teclear.next();
				System.out.print("Ingrese Numero de cuenta: ");
				int Ncuenta=Teclear.nextInt();
				System.out.print("Ingrese Saldo: ");
				Double saldo=Teclear.nextDouble();
				CLienteBanco data=new CLienteBanco(id,nombre,Ncuenta,saldo);
				if (Sistema.Inserta(data)) {
					System.out.println("agregado exitoso");
				}else {
					System.out.println("Error al agregar");
				}
				break;
				

			case 2:
				System.out.println("Ingrese Numero de Cuenta a Modificar Saldo : ");
			//	Sistema.Buscar(CLienteBanco.getnCuenta());
				break;
			case 3:
				System.out.println("Ingrese Numero de Cuenta a Dar de Baja : ");
			

				break;
			case 4:
				System.out.println("lista : ");
				Sistema.InOrden(Sistema.getRaiz());
				break;
			case 5:
//				Sistema.Buscar(CLienteBanco.getnCuenta());
				System.out.println("Se han dado de baja todas las cuentas Con saldo Negativo");
				break;

			case 6:
				System.out.println(" Esta seguro de cerrar? s/n");
		//		String cerrar=Teclear.next()==
			//	b = cerrar.compareToIgnoreCase("s") ?true:false;
				break;
			}
		}

	}

	private static int menu() {
		
		System.out.println("1. Agregar al sistema");
		System.out.println("2. Modificar Saldo");
		System.out.println("3. Dar de baja");
		System.out.println("4. Mostrar Base de Datos");
		System.out.println("5. Dar de baja Saldos negativos");
		System.out.println("6. Salir del Sistema");

		return new Scanner(System.in).nextInt();
	}

}
