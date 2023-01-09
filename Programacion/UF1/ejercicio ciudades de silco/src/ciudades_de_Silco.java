import java.util.Scanner;

public class ciudades_de_Silco {

	public static void main(String[] args) {
		int x = 0;
		String original;
		String ciudad;
		String[] temp;
		String[] numstxt;
		String[] ciudades;
		int[] nums = new int[3];
		Scanner teclado = new Scanner(System.in);
		while (x == 0) {
			System.out.println(
					"Introduce los datos con este formato\nCiudad;Numero;Numero,Numero;Ciudad,Ciudad,Ciudad,Ciudad");
			original = teclado.nextLine();
			temp = original.split(";");// divide la frase oroginal cada vez que hay ' ; '
			if (temp.length == 4) {// se asegura de que haya la cantidad de separaciones correctas
				ciudad = temp[0];
				nums[0] = Integer.parseInt(temp[1]);// transforma string en int
				numstxt = temp[2].split(",");
				if (numstxt.length == 2) {// se asegura de que haya la cantidad de separaciones correctas
					nums[1] = Integer.parseInt(numstxt[0]);
					nums[2] = Integer.parseInt(numstxt[1]);
					ciudades = temp[3].split(",");
					if (ciudades.length == 4) {// se asegura de que haya la cantidad de separaciones correctas
						System.out.println("Silco actúa en " + ciudad + "con los números " + nums[0] + ", " + nums[1]
								+ " y " + nums[2] + ", y cuyas ciudades colindantes son " + ciudades[0] + ", "
								+ ciudades[1] + ", " + ciudades[2] + " y " + ciudades[3]);
						x = 1;
					}
				}
			} else {
				System.out.println("Pon el formato correcto:\nTexto;Numero;Numero,numero;ciudad,ciudad,ciudad,ciudad");
			}
		}
		teclado.close();
	}
}
