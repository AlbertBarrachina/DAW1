
//Albert Barrachina
import java.util.Scanner;

public class boletaires {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char c;// char per a introdur caracter per a reiniciar o tancar el programa
		int i = 0;// variavle per a loop 1
		int j = 0;// variable per a loop 2
		int t1 = 0;// variables per a temp y pluj dels dos dies
		int t2 = 0;
		int p1 = 0;
		int p2 = 0;

		while (i == 0) {// obrim un bucle 1 per a poder reiniciar mes tard
			System.out.println("Introdueix la temperatura del primer dia");// ens demanden introduir les cuatre
																			// variables de temperatura y pluja
			t1 = teclado.nextInt();
			System.out.println("Introdeix la pluja del primer dia");
			p1 = teclado.nextInt();
			System.out.println("Introdueiix la temperatura del segon dia");
			t2 = teclado.nextInt();
			System.out.println("Introdeix la pluja del segon dia");
			p2 = teclado.nextInt();

			if (t1 >= 10 && t1 <= 20 && t2 >= 10 && t2 <= 20 && p1 >= 10 && p1 <= 20 && p2 >= 10 && p2 <= 20) {
				// comprobacio 1 de quin clima hi ha
				System.out.println("Sortiran rovellons. :)");
			} else if (t1 >= 1 && t1 <= 5 && t2 >= 1 && t2 <= 5 && p1 >= 0 && p1 <= 0 && p2 >= 0 && p2 <= 0) {
				// comprobacio 2 de quin clima hi ha
				System.out.println("Sortiran fredolics. :)");
			} else {
				System.out.println("No sortira res. :(");
			}
			j = 0;
			while (j == 0) {// bucle 2
				System.out.println("Vols tornar a entrar dades? (S/N)");
				c = teclado.next().charAt(0);// introduim un caracter
				if ('S' == c || 's' == c) {// si es 'S' o 's' torne al principi de bucle 1
					i = 0;
					j = 1;
					System.out.print("\n\n\n");
				} else if ('N' == c || 'n' == c) {// si es 'N' o 'n' acabe el bucle 1
					i = 1;
					j = 1;
					System.out.println("Tancant programa.");
				}
			}
		}
		teclado.close();
	}

}
