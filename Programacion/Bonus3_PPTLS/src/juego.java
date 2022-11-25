import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
		/*
		 * Primero se pedirá el número de partidas que se van a jugar. Se jugaran cada
		 * una de las partidas y se irá mostrando las puntuaciones del jugador y de la
		 * máquina. Al finalizar se muestra quien es el ganador Cuando acabe la partida,
		 * se ofrecerá al usuario la posibilidad de volver a jugar
		 */

		// variables
		int i = 0;
		int maquina = 0;
		int scorem = 0;
		int jugador = 0;
		int scorej = 0;
		Scanner teclado = new Scanner(System.in);
		// input
		System.out.println("Cuantas veces quieres jugar a este juego de muerte?");
		i = teclado.nextInt();
		// operaciones
		while (i > 0) {
			System.out.println("Piedra(1) Papel(2) Tijera(3) Lagarto(4) Spock(5)!!");
			System.out.println("Quedan " + i + " rondas.");
			maquina = (int) (Math.random() * 5 + 1);
			jugador = teclado.nextInt();
			if (jugador > 0 && jugador < 6) {
				// 1 es el valor de piedra
				if (maquina == 1) {

					if (jugador == 1) {
						System.out.println("La maquina ha sacado piedra!");
						System.out.println("Las piedras colisionan en el aire, es muy impresionante... Empatas");
					}
					if (jugador == 2) {
						System.out.println("La maquina ha sacado piedra!");
						System.out.println(
								"De alguna forma un trozo de papel mojado ha parado la piedra! Ganas la ronda!");
						scorej++;
					}
					if (jugador == 3) {
						System.out.println("La maquina ha sacado piedra!");
						System.out.println("La piedra aplasta tus tijeras enclenques! Pierdes la ronda...");
						scorem++;
					}
					if (jugador == 4) {
						System.out.println("La maquina ha sacado piedra!");
						System.out.println("La piedra aplasta tu lagartija! Pierdes la ronda");
						scorem++;
					}
					if (jugador == 5) {
						System.out.println("La maquina ha sacado piedra!");
						System.out.println("Desintegras la piedra! Ganas la ronda!");
						scorej++;
					}
				}

				// 2 es el valor de papel
				if (maquina == 2) {

					if (jugador == 1) {
						System.out.println("La maquina ha sacado papel!");
						System.out.println(
								"De alguna forma un trozo de papel mojado ha parado tu piedra... Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 2) {
						System.out.println("La maquina ha sacado papel!");
						System.out.println("Los dos os defendeis con papel... no pasa nada. Emapate.");
					}
					if (jugador == 3) {
						System.out.println("La maquina ha sacado papel!");
						System.out.println(
								"Te acercas a la maquina y cortas todos sus documentos importantes! Ganas la ronda.");
						scorej++;
					}
					if (jugador == 4) {
						System.out.println("La maquina ha sacado papel!");
						System.out.println("Tu lagartija se come un papel! Ganas la ronda.");
						scorej++;
					}
					if (jugador == 5) {
						System.out.println("La maquina ha sacado papel!");
						System.out.println(
								"La maquina da unos papeles desautorizando a Spock y este se retira... Pierdes la ronda.");
						scorem++;
					}
				}

				// 3 es el valor de tijera
				if (maquina == 3) {

					if (jugador == 1) {
						System.out.println("La maquina ha sacado tijeras!");
						System.out.println("Aplastas las tijeras enclenques de la maquina! Ganas la ronda!");
						scorej++;
					}
					if (jugador == 2) {
						System.out.println("La maquina ha sacado tijeras!");
						System.out.println(
								"La maquina corta todos tus documentos importantes y ahora no puedes irte del pais... Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 3) {
						System.out.println("La maquina ha sacado tijeras!");
						System.out.println("Ehmmmm... Empate");
					}
					if (jugador == 4) {
						System.out.println("La maquina ha sacado tijeras!");
						System.out.println(
								"La maquina corta la cola de la lagartija y esta se va espantada, no se que esperavas... Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 5) {
						System.out.println("La maquina ha sacado tijeras!");
						System.out.println("Spock coje las tijeras y las desmonta! Ganas la ronda.");
						scorej++;
					}
				}

				// 4 es el valor de lagarto
				if (maquina == 4) {

					if (jugador == 1) {
						System.out.println("La maquina ha sacado lagarto!");
						System.out.println("Cortas la cola de la lagartija y esta se va espantada! Ganas la ronda.");
						scorej++;
					}
					if (jugador == 2) {
						System.out.println("La maquina ha sacado lagarto!");
						System.out.println("La lagartija se come dos papeles! Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 3) {
						System.out.println("La maquina ha sacado lagarto!");
						System.out.println("Le cortas la cola de la lagartija y esta se va espantada! Ganas la ronda!");
						scorej++;
					}
					if (jugador == 4) {
						System.out.println("La maquina ha sacado lagarto!");
						System.out.println("Las dos lagartijas de hacen amigas y se van... Empate.");
					}
					if (jugador == 5) {
						System.out.println("La maquina ha sacado lagarto!");
						System.out.println(
								"La lagartija muerde a Spock, spock se hace daño y se cae por el hueco del ascensor... Pierdes la ronda.");
						scorem++;
					}
				}

				// 5 es el valor e spock
				if (maquina == 5) {

					if (jugador == 1) {
						System.out.println("La maquina ha sacado Spock!");
						System.out.println("Spock desintegra tu pierda y te deprimes.. Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 2) {
						System.out.println("La maquina ha sacado Spock!");
						System.out.println("Das unos papeles desautorizando a Spock y este se retira! Ganas la ronda!");
						scorej++;
					}
					if (jugador == 3) {
						System.out.println("La maquina ha sacado Spock!");
						System.out.println("Spock coje las tijeras y las desmonta... Pierdes la ronda.");
						scorem++;
					}
					if (jugador == 4) {
						System.out.println("La maquina ha sacado Spock!");
						System.out.println(
								"Tu lagartija muerde a Spock, a Spock le hace daño y se cae por el hueco del ascensor! Ganas la ronda!");
						scorej++;
					}
					if (jugador == 5) {
						System.out.println("La maquina ha sacado Spock!");
						System.out.println("Spock se mira en el espejo y posa... Empate.");

					}

				}
				i--;

			}
		}
		teclado.close();// cierra el scaner para no petarte eclipse
	}
}
// output
