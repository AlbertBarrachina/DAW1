import java.util.Scanner;

public class juego_chinos {

	public static void main(String[] args) {
		// variables
		int uno = 0;// uno es el nombre para try catch
		int i = 0;
		int ronda = 1;
		int apuestaj = 0;
		int cantidadj = 0;
		int puntosj = 0;
		int cantidadm = 0;
		int apuestam = 0;
		int puntosm = 0;
		int repeat = 0;
		Scanner teclado = new Scanner(System.in);
		// input

		while (uno == 0) {
			System.out.println("Bienvenidos al Juego de las tres piedras.");
			System.out.println("¿Cuántas rondas queréis jugar?");
			try {
				i = Integer.parseInt(teclado.nextLine());

				if (i > 0) {
					uno = 1;
				} else {
					uno = 0;
				}
			} catch (Exception e) {
				System.out.println("Eso no es un numero.");
				uno = 0;
			}

			while (i > ronda - 1) {
				System.out.println("\n ____________________________\n");
				System.out.println("Inicio ronda " + ronda + ".");
				while (uno == 1) {
					try {
						System.out.println("Jugador: ¿Cuántas?");
						cantidadm = (int) (Math.random() * 4);
						cantidadj = Integer.parseInt(teclado.nextLine());
						if (cantidadj > 3 || cantidadj < 0) {
							System.out.println("Piensa otra vez, tienes 3 piedras.");
							uno = 1;
						} else if (cantidadj >= 0 || cantidadj <= 3) {
							uno = 2;
						}
					} catch (Exception e) {
						System.out.println("Pon una cantidad entre 0 y 3.");
						uno = 1;
					}
					while (uno == 2) {
						try {
							System.out.println("Jugador: Apuesta?");
							apuestam = (int) (Math.random() * ((7 - cantidadm) + cantidadm));
							apuestaj = Integer.parseInt(teclado.nextLine());
							if (apuestaj <= 6 && apuestaj >= cantidadj) {
								uno = 3;
							} else if (apuestaj < cantidadj || apuestaj > 6) {
								System.out.println("Piensa otra vez.");
								uno = 2;
							}
						} catch (Exception e) {
							System.out.println("Pon un numero entre " + cantidadj + " y 6.");
							uno = 2;
						}
					}

				}
				// operaciones
				System.out.println("Ordenador: Cuantas?" + cantidadm);
				System.out.println("Ordenador: Apuesta?" + apuestam);
				System.out
						.print("Resultado ronda: " + cantidadj + "+" + cantidadm + "=" + (cantidadj + cantidadm) + ".");
				if (cantidadj + cantidadm == apuestaj) {
					System.out.print(" Gana jugador!!");
					puntosj++;
				} else if (cantidadj + cantidadm == apuestam) {
					System.out.print(" Gana maquina!!");
					puntosm++;
				} else {
					System.out.print(" Empate, nadie gana!!");
				}
				// System.out.println();
				uno = 1;
				ronda++;
			}

			// output
			if (puntosj > puntosm) {
				System.out.println("El jugador gana el juego.");
			} else if (puntosm > puntosj) {
				System.out.println("La maquina gana el juego.");
			} else {
				System.out.println("Empate, nadie gana.");
			}
			System.out.println(ronda + " rondas jugadas: Maquina " + puntosm + " y Jugador " + puntosj + ".");

			try {
				System.out.println("¿Queréis volver a jugar?[ 0-> No, 9->Sí]");
				repeat = Integer.parseInt(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("pon 0 o 9");
			}
			if (repeat == 9) {
				System.out.println("Reiniciando...\n\n\n\n");
				uno = 0;
			} else if (repeat == 0) {
				System.out.println("Fin del Juego");
				teclado.close();
			}
		}
	}

}
