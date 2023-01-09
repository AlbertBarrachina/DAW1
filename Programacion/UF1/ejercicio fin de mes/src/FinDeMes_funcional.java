import java.util.Scanner;

public class FinDeMes_funcional{

	public static void main(String[] args) {
		int final_mes = 0;
		int saldo = 0;
		int cambio = 0;
		int casos = 0;
		int rule = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Entra el numero de casos que quieres entrar");
		casos = teclado.nextInt();

		while (casos != 0) {
			System.out.println("Entra un saldo y un cambio");
			while (rule == 0) {
				saldo = teclado.nextInt();
				cambio = teclado.nextInt();
				if ((saldo < -10001 || saldo > 10001) || (cambio < -10001 || cambio > 10001)) {
					System.out.println("EROR!!\n Pon numeros validos");
				}else if ((saldo > -10001 && saldo < 10001) && (cambio > -10001 && cambio < 10001))
				rule = 1;
			}
			final_mes = saldo + cambio;
			if (final_mes >= 0) {
				System.out.println("SI");
			} else if (final_mes < 0) {
				System.out.println("NO");
			}
			rule = 0;
			casos--;
		}
		teclado.close();
	}

}