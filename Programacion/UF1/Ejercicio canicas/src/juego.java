import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
		// variables
		int canicasj = 10;
		int apuestaj = 0;
		int numj = 0;
		int canicasm = 10;
		int numm = 0;
		int i = 1;
		int canicasmenor = 0;
		int suma = 0;
		int j;
		Scanner teclado = new Scanner(System.in);
		// input
		System.out.println("Hola jugador, bienvenido al juego de las canicas");
		while (canicasj > 0 && canicasm > 0) {
			System.out.println("RONDA " + i);
			do {
				System.out.println("¿Cual es tu apuesta?(Introduce un numero)");
				System.out.println("1.Par");
				System.out.println("2.Impar");
				apuestaj = teclado.nextInt();
			} while (apuestaj > 2 || apuestaj < 1);// mientras el numero de apuesta sea 1(par) o 2(impar)

			do {
				if (apuestaj == 1) {// diferentes prguntas dependiendo de lo elegido
					System.out.println("Has elegido: Par ¿cuantas canicas quieres apostar?");
				}
				if (apuestaj == 2) {
					System.out.println("Has elegido: Impar ¿cuantas canicas quieres apostar?");
				}
				System.out.println("tienes " + canicasj + " canicas.");// cuantas canicas tienes en cada ronta para
																		// apostar
				numm = (int) (Math.random() * canicasm + 1);
				numj = teclado.nextInt();
			} while (numj < 1 || numj > canicasj);// este while se asegura de que pongas un numero de canicas que si que
													// tengas
			if (apuestaj == 1) {// te dice que ha elegido la IA
				System.out.println("El ordenador ha elegido: impar y apuesta " + numm + " canicas");
			}
			if (apuestaj == 2) {
				System.out.println("El ordenador ha elegido: par y apuesta " + numm + " canicas");
			}
			// operaciones
			canicasmenor = numm;// selecciona la apuesta menor para restarla luego al perdedor y suarla al
								// ganador
			if (numj < numm) {
				canicasmenor = numj;
			}
			suma = numj + numm;// suma las canicas, dice si es par o impar y dice los resultados de la ronda en
								// ese orden
			if (suma % 2 == 0) {
				if (apuestaj == 1) {
					canicasm = canicasm - canicasmenor;
					canicasj = canicasj + canicasmenor;
					System.out.println("Resultado de la ronda: " + numj + " + " + numm + "= " + suma
							+ "¡El resultado es par! Ganas " + canicasmenor + " canicas.");
				} else {
					canicasj = canicasj - canicasmenor;
					canicasm = canicasm + canicasmenor;
					System.out.println("Resultado de la ronda: " + numj + " + " + numm + "= " + suma
							+ "¡El resultado es par! El ordenador gana " + canicasmenor + " canicas.");
				}

			}
			if (suma % 2 != 0) {
				if (apuestaj == 2) {
					canicasm = canicasm - canicasmenor;
					canicasj = canicasj + canicasmenor;
					System.out.println("Resultado de la ronda: " + numj + " + " + numm + "= " + suma
							+ " ¡El resultado es impar! Ganas " + canicasmenor + " canicas.");
				} else {
					canicasj = canicasj - canicasmenor;
					canicasm = canicasm + canicasmenor;
					System.out.println("Resultado de la ronda: " + numj + " + " + numm + "= " + suma
							+ " ¡El resultado es impar! El ordenador gana " + canicasmenor + " canicas.");
				}
			}
			System.out.println("Resumen de puntuaciones:");
			System.out.println("Jugaor: " + canicasj + " canicas.");
			System.out.println("Ordenador: " + canicasm + " canicas.");
			// añade +1 a la ronda actual para decir en que ronda estas al volver a empezar
			// el loop
			i++;
		}
		// output
		System.out.println("Fin del juego");
		if (canicasm == 0) {
			System.out.println("Has ganado.");
		}
		if (canicasj == 0) {
			System.out.println("Has perdido.");
		}
		teclado.close();
	}

}
