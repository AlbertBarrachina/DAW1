import java.util.Scanner;

public class ventas {

	public static void main(String[] args) {
		// variables
		Scanner teclado = new Scanner(System.in);
		String[] dias = { "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
		String respuesta;
		Double dinero = 0.00;
		Double maxBal = 0.00;
		Double minBal = 0.00;
		Double suma = 0.00;
		int i = 0;
		int dia1 = 0;
		int dia2 = 0;

		// pide los valores para los 6 dias
		for (i = 0; i < 6; i++) {
			dinero = teclado.nextDouble();
			// if para hacer que el valor minimo tenga algun valor al que compararse
			if (i == 0)
				minBal = dinero;
			// establede cual dia tiene el valor maximo
			if (dinero > maxBal) {
				maxBal = dinero;
				dia1 = i;
				// establece cual dia tiene el valor minimo
			} else if (dinero < minBal) {
				minBal = dinero;
				dia2 = i;
			}
			// suma de los valores
			suma = suma + dinero;
		}
		// media de los valores
		suma = suma / 6;
		// imprime el dia con mas ventas, el dia con menos y si el domingo huvo mas
		// ventas que la media
		if (suma > dinero)
			respuesta = "NO";
		else
			respuesta = "SI";
		if (minBal != maxBal)
			System.out.println(dias[dia1] + " " + dias[dia2] + " " + respuesta);
		else
			System.out.println("EMPATE " + respuesta);
		teclado.close();
	}

}