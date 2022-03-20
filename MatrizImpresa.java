package Interfaz;
/*
 * @autor:Joel_Landeros@protonmail.com 
 */
public class MatrizImpresa {

	public static void main(String[] args) {
		int y=5;
		int x=5;		
		int[][] mat = new int[y][x];

		//Espiral.Izquierda(mat, y, x);
		//Espiral.Derecha(mat);
		Espiral.Izquierda(mat,5,5);
		ImprimeMatriz(mat);
		
	}

	private static void ImprimeMatriz(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " \t");
			}

		}

	}
}