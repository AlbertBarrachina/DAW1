import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Prova2 {
	public static void main(String[] args) {
// Scanner y random
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
// Arrays
		int num[] = new int[10];
		int mat3[][] = new int[2][5];
// Variables
		int numGen = 0;
		int x = 0;
		int numGrande = 0;
		boolean seguir = true;
		int opcion = 0;
		while (seguir == true) {
// Se muestra el menu
			System.out.println("-------------------------------------------------------");
			System.out.println("MENU");
			System.out.println("1 - Generar array de 10 numeros aleatorios");
			System.out.println("2 - Mostrar el numero más grande y repeticiones");
			System.out.println("3 - Guardar la array en una matriz 2x5");
			System.out.println("9 - Salir del programa");
// Se pide un numero al usuario
			opcion = scan.nextInt();
// Si el numero no está en el rango, se descarta y vuelve a saltar el menu
			if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 9) {
				System.out.println("ERROR: El numero está fuera del rango");
			}
			if (opcion == 1) {
				x = 0;
				while (x < num.length) {
// Numeros generados del 1 al 31
					numGen = (rand.nextInt(31) + 1);
// Si el numero es impar
					if (numGen % 2 == 1) {
// Se guarda el numero
						num[x] = numGen;
						x++;
					}
				}
// Se muestra el resultado
				System.out.println(Arrays.toString(num));
			} else if (opcion == 2) {
// Se resetea el valor del contador y el numero grande
				x = 0;
				numGrande = 0;
// Se compara todos los numeros de la array
				for (int i = 0; i < num.length; i++) {
// Si un numero es más grande
					if (numGrande < num[i]) {
// Se le asigna a la variable
						numGrande = num[i];
					}
				}
// Se cuenta las repeticiones del numero más grande
				for (int i = 0; i < num.length; i++) {
					if (numGrande == num[i]) {
// Si coincide, se suma por 1 al contador
						x++;
					}
				}
// Se muestra el resultado
				System.out.println("El numero más grande es: " + numGrande + " y se repite " + x + " veces.");
			} else if (opcion == 3) {
				x = 0;
				/*
				 * Guarda en la matriz mat3 los numeros generados por la array num
				 */
				for (int i = 0; i < 2; i++) {
					for (int k = 0; k < 5; k++) {
						mat3[i][k] = num[x];
						x++;
					}
				}
// Printa la matriz mat3
				for (int i = 0; i < 2; i++) {
					for (int k = 0; k < 5; k++) {
						System.out.print(mat3[i][k] + "\t");
					}
					System.out.println("");
				}
			} else if (opcion == 9) {
// Si eligen la opción 9, se finaliza el programa
				seguir = false;
			}
		}
// FIN DEL PROGRAMA
		scan.close();
		System.out.println("FIN DEL PROGRAMA");
	}

}
