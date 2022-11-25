import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		// variables
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		// input

		do {
			System.out.println("introduce un numero del entre el 1 y el 10");
			try {
			n = Integrer.parseInt(teclado.nextLine);
			}catch(Exeption e){
				System.out.println(e.getMessage);
			}
		} while (n > 9 || n < 2);
		
			System.out.println("no eres tonto!");
		

	}

}
