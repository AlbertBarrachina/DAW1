import java.util.Scanner;

public class fin_mes_corto {

	public static void main(String[] args) {
		// variables
		int casos = 0;
		int cat = 0;
		int saldo = 0;
		int cambio = 0;
		Scanner teclado = new Scanner(System.in);
		// input
		while (cat == 0) {// este while hace que tengas que poner un numero de escenarios mayor a 0.
			try {
				casos = Integer.parseInt(teclado.nextLine());
				if (casos > 0) {
					cat = 1;
				} else if (casos < 1) {
					System.out.println("Pon un numeor valido.");
				}
			} catch (Exception e) {
				System.out.println("Pon un numeor valido.");
			}

		}
		while (casos > 0) {
			while (cat == 1) {
				try {
					saldo = Integer.parseInt(teclado.nextLine());
					// if que se asegura de que no pongas un saldo de -10.000 o menor
					if (saldo > -10000) {
						cat = 2;
					} else if (saldo < -9999) {
						System.out.println("Pon un numeor valido.");
					}
				} catch (Exception e) {
					System.out.println("Pon un numeor valido.");
				}
			}
			while (cat == 2) {
				try {
					cambio = Integer.parseInt(teclado.nextLine());
					// este if y if else se aseguran de que introduzcas un numero menor de 10.000.
					if (cambio < 10000) {
						cat = 3;
					} else if (cambio > 9999) {
						System.out.println("Pon un numeor valido.");
					}
				} catch (Exception e) {
					System.out.println("Pon un numeor valido.");
				}
			} // operaciones (suma los dos para ver si acabas en numeros rojos.
			if (saldo + cambio >= 0) {
				System.out.println("SI.");
			} else if (saldo + cambio < 0) {
				System.out.println("NO.");
			}
			casos--;
			cat = 1;
		}
		teclado.close();
	}

}
