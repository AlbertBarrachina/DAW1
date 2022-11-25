import java.util.Scanner;

public class Suma_suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Enunciado Se trata de implementar un programa que sume los dígitos de un
		 * número entero no negativo. Por ejemplo, la suma de los dgitos del 3433 es 13.
		 * Para darle un poco más de emoción, el programa no se limitará a escribir el
		 * resultado de la suma, sino que tambien escribirá todos los sumandos
		 * utilizados: 3 + 4 + 3 + 3 = 13.
		 * 
		 * Entrada La entrada consta de una serie de casos de prueba terminados con un
		 * número negativo. Cada caso de prueba es una simple línea con un número no
		 * negativo no mayor que 109 del que habría que sumar todos sus dígitos.
		 * 
		 * Salida Para cada caso de prueba se mostrará una línea en la que aparecerán
		 * cada uno de los dígitos separados por el signo +, tras lo cual aparecerá el
		 * símbolo = y la suma de todos los dígitos. Ten en cuenta que antes y después
		 * de cada símbolo (+ y =) hay un espacio.
		 * 
		 * Entrada de ejemplo 3433 64323 8 -1 Salida de ejemplo 3 + 4 + 3 + 3 = 13 6 + 4
		 * + 3 + 2 + 3 = 18 8 = 8
		 */
		// variables
		int num = 0;
		Scanner teclado = new Scanner(System.in);
		// input

		System.out.println("introduce la serie de numeros.");
		
		// operaciones
		while (num > -1 && num < 110) {
			num = teclado.nextInt();
			
			// output

			System.out.println(" + ");

		}
	}
}