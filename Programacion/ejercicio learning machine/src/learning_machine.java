import java.util.Scanner;

public class learning_machine {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String A = "";
		String B = "";
		int n = 0;

		for (int i = 0; i == 0;) {//pide la string A
			System.out.println("introduce el primer string");
			A = teclado.nextLine().toLowerCase();
			if (A.length() <= 80 && A.substring(A.length() - 1).equals("#")) {//comprueba que la string cumpla los requisitos
				i = 1;
			} else
				System.out.println("Pon una string con longitud max 80 char y con # al final.");
		}
		for (int k = 0; k == 0;) {//pide la string B
			System.out.println("introduce el segundo string");
			B = teclado.nextLine().toLowerCase();
			if (B.length() <= 25 && B.substring(B.length() - 1).equals("#")) {//comprueba que la string cumpla los requisitos
				k = 1;
			} else
				System.out.println("Pon una string con longitud max 25 char y con # al final.");
		}
		System.out.println("Resultado:");
		for (int j = 0; j < B.length() - 1; j++) {//comprueba cuantas veces se repite cada letra de B en A
			n = 0;
			for (int l = 0; l < A.length() - 1; l++) {
				if (B.substring(j, j + 1).equals(A.substring(l, l + 1))) {
					n++;
				}
			}
			System.out.println(B.substring(j, j + 1) + "->" + n);
		}
		teclado.close();
	}

}
