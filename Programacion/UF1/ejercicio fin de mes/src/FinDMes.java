import java.util.Scanner;

public class FinDMes {

	public static void main(String[] args) {
		int final_mes = 0;
		int saldo = 0;
		int cambio = 0;
		int casos = 0;
		Scanner teclado = new Scanner(System.in);

		saldo = cambio = 10001;
		final_mes = casos = 0;

		System.out.println("Entra el numero de casos que quieres entrar");
		casos = teclado.nextInt();

		while (casos != 0) {
			System.out.println("Entra un saldo y un cambio");
			while ((saldo < -10001 || saldo > 10001) || (cambio < -10001 || cambio > 10001)) {
				saldo = teclado.nextInt();
				cambio = teclado.nextInt();
			}
			final_mes = saldo + cambio;
			if (final_mes >= 0) {
				System.out.println("SI");
			} else if (final_mes < 0) {
				System.out.println("NO");
			}
			casos--;
		}
		teclado.close();
	}

}
