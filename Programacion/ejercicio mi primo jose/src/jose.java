import java.util.Scanner;

public class jose {

	public static void main(String[] args) {
		int n = 0;
		int repetir = 1;
		Scanner teclado = new Scanner(System.in);

		int[] numeros = new int[200];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 401 + 100);
		}
		while (repetir == 1) {
			System.out.println("1.-Maximo. Calcula y muestra el valor máximo.\n"
					+ "2.- Veces Mínimo. Calcula y muestra cuantas veces está el valor mínimo dentro del array aleatorio.\n"
					+ "3.- Frecuencias. Calcula y muestra las frecuencias de cada valor.\n"
					+ "4.- Mostrar el array de números que ha generado el programa.\n" + "5.- Salir del programa.\n");
			n = teclado.nextInt();
			if (n == 1) {
				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i]>numeros[i-1]) {
						
					}
				}
			} else if (n == 2) {

			} else if (n == 3) {

			} else if (n == 4) {

			} else if (n == 5) {
				repetir = 0;
				System.out.println("Ya lo rompiste =_=!");
			} else {

			}
			System.out.println("\n\n\n\n\n\n");
		}
		teclado.close();
	}

}
