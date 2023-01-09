import java.util.Scanner;

public class act2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		char a[];
		char b[];
		//codigo que pide los textos
		System.out.println("Pon el primer texto");
		s1 = teclado.nextLine();
		a = s1.toCharArray();
		System.out.println("Pon el segundo texto");
		s2 = teclado.nextLine();
		b = s2.toCharArray();
		//funcion de comparar
		comparar(a, b);
		teclado.close();
	}
	// ************************************************************************************
	// ** Nombre de la función: comparar
	// ** Explicación del que hace la función: compar la longitud de dos string
	// ** Parámetros de entrada: char[],char[]
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void comparar(char[] a, char[] b) {
		int comparar = 0;
		if (a.length > b.length) {
			comparar = -1;
		} else if (a.length == b.length) {
			comparar = 0;
		} else if (a.length < b.length) {
			comparar = 1;
		}
		System.out.println(comparar);
	}
}