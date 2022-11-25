
//Albert Barrachina
import java.util.Scanner;

public class toros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = 0; // numeor de toros
		int i; // variable contador
		int j = 0;// variable para repetir el programa si nada se incumple
		int temp;// velocidad del toro mas rapido
		int[] toro; // array torros

		while (j == 0) {// while para repetir en caso de que no haya ninguna norma rota
			i = 0;
			temp = 0;
			System.out.println("¿Número de toros?");
			n = teclado.nextInt();//introduce el nuimero de toros
			
			if (n <= 30 && n >= 1 && n % 2 != 0) {// normas para que el programa funcione, n esta entre 30 y 1
													// (incluidos estos) y es impar
				while (i < n) {
					toro = new int[n];// crea tantos toros como se han introducido anteriormente
					toro[i] = (int) (Math.random() * 54 + 26);// numero aleatorio entre 26 y 79
					if (toro[i] > temp) {// si la velocidad del toro es mayor a la velocidad de temp temp pasa a
											// tener
											// ese numero
						temp = toro[i];
					}
					System.out.println("Velocidad toro " + (i + 1) + ":" + toro[i]);
					i++;
				}
				System.out.println("El corredor irá a " + (temp + 1) + " km/h.");
			} else {
				System.out.println("Fin del programa.");
				teclado.close();
				j = 1;
			}
		}
	}
}
