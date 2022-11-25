import java.util.Scanner;
import java.util.Random;

public class matriz_letras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[][] mat = new char[10][10];
		boolean repetir = true;
		String randoms = "ABCDEFGHIJ";
		int key = 0;
		int op = 0;
		int cons = 0;
		int n = 0;
		int i = 0;
		int A = 0;
		int E = 0;
		int I = 0;
		Random r = new Random();
		while (repetir) {
			System.out.println("1.-Crear matriz.");
			System.out.println("2.-Mostrar matriz.");
			System.out.println("3.-Mostrar vocal mas repetida.");
			System.out.println("4.-Cuantas consonantes hay en la diagonal de la matriz.");
			System.out.println("9.-Sali del programa.");
			op = teclado.nextInt();
			if (op == 1) {
				for (i = 0; i < 9; i++) {
					for (n = 0; n < 9; n++) {//genera las letras aleatorias
						mat[i][n] = (randoms.charAt(r.nextInt(randoms.length())));
					}
				}
				key = 1;
			} else if (op == 2 && key == 1) {
				for (i = 0; i < 9; i++) {
					for (n = 0; n < 9; n++) {//imprime la matriz
						System.out.print(mat[i][n] + "  ");
					}
					System.out.println();
				}
			} else if (op == 3 && key == 1) {
				A = 0;
				E = 0;
				I = 0;
				for (i = 0; i < 9; i++) {
					for (n = 0; n < 9; n++) {//cuenta cuantas vezes se repite cada vocal en toda la matriz
						if (mat[i][n] == 'A') {
							A++;
						} else if (mat[i][n] == 'E') {
							E++;
						} else if (mat[i][n] == 'I') {
							I++;
						}
					}
				}
				if (A >= I && A >= E)
					System.out.println("A = " + A);
				if (E >= I && E >= A)
					System.out.println("E = " + E);
				if (I >= E && I >= A)
					System.out.println("I = " + I);
			} else if (op == 4 && key == 1) {
				i = 0;
				n = 0;
				cons = 0;
				while (i < 9 && n < 9) {
					if (mat[i][n] != 'A' && mat[i][n] != 'E' && mat[i][n] != 'I') {//suma uno cad vez que encunetra una letra que no se A, E o I
						cons++;
					}
					i++;
					n++;
				}
				System.out.println("Hay " + cons + " consonantes en la diagonal principal.");
			} else if (op == 9) {
				System.out.println("Saliendo de la aplicacion.");
				repetir = false;
			} else if (op == 2 || op == 3 || op == 4 && key == 0) {
				System.out.println("Primero tienes que generar las letras.");
			} else
				System.out.println("Pon un numero correcto.");
		}
		teclado.close();
	}

}
