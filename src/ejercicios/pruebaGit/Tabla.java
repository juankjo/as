package ejercicios.pruebaGit;

import java.util.Scanner;

public class Tabla {

	/**
	 *  
	 */
	public static void main(String[] args) {//alt+may+R Cambiar todos. ctrl+M max min...para volver a editor F12
		Scanner sc = new Scanner(System.in);

		int[][] tablero4x4 = new int[4][4];
		
		for (int i = 0; i < tablero4x4.length; i++) {//filas
			for (int j = 0; j < tablero4x4[i].length; j++) {//columnas
                System.out.println("Dígame que número quiere introducir en la posición " + i + ", " + j + ": ");
                tablero4x4[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < tablero4x4.length; i++) {//filas
			for (int j = 0; j < tablero4x4[i].length; j++) {//columnas
				System.out.println("Elemento en la posición " + i + ", " + j + ": " + tablero4x4[i][j]);
			}
		}
		
		sc.close();
	}

}
