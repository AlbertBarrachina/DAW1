import java.util.Scanner;

public class gvec {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] vector = new int[30];
		boolean repetir = true;
		int numero = 0;
		int opcion = 0;
		// hace que la array tenga -1 en todas las posiciones
		for (int i = 0; i < vector.length; i++) {
			vector[i] = -1;
		}
		// while para repetir el programa hasta que se ciere
		while (repetir) {
			// menu
			System.out.println(
					"1 - Introducir elemento en el vector\r\n" + "2 - Muestra vector\r\n" + "3 - Borrar elemento\r\n"
							+ "4 - Busca elemento\r\n" + "5 - Ordenar vector\r\n" + "6 - Salir\r\n" + "");
			opcion = teclado.nextInt();
			if (opcion == 1) {
				// si el array esta lleno nos muestra un mensaje de error
				if (EstaLleno(vector)) {
					System.out.println("El vector esta lleno!");
				} else {
					System.out.println("Introduce el numero.");
					numero = teclado.nextInt();
					// si el numero introducido es positivo lo introduce, sino muestra un mensaje de
					// error
					if (numero >= 0) {
						IntroducirElemento(vector, numero);
					} else
						System.out.println("Introduce un numero positivo!\n\n");
				}
			} else if (opcion == 2) {
				// si el array esta vacio nos muestra un mensaje de error
				if (EstaVacio(vector)) {
					System.out.println("El vector esta vacio.");
				} else {
					ListarVector(vector);
				}
			} else if (opcion == 3) {
				// si el array esta vacio nos muestra un mensaje de error
				if (EstaVacio(vector)) {
					System.out.println("El vector esta vacio.");
				} else
					QuitarElemento(vector);
			} else if (opcion == 4) {
				// si el array esta vacio nos muestra un mensaje de error
				if (EstaVacio(vector)) {
					System.out.println("El vector esta vacio.");
				} else {
					System.out.println("Que numero quieres buscar?");
					numero = teclado.nextInt();
					// si el numero introducido es negativo muestra error de lo contrario muestra en
					// que posiciones se encuantra(en caso de no estar muestra -1)
					if (numero < 0) {
						System.out.println("No se aceptan numeros negativos.");
					} else
						BuscarElemento(vector, numero);
				}
			} else if (opcion == 5) {
				// si el array esta vacio nos muestra un mensaje de error
				if (EstaVacio(vector)) {
					System.out.println("El vector esta vacio.");
				} else {
					System.out.println("1-Orden descendente \n2-Orden ascendente");
					numero = teclado.nextInt();
					// si se introduce un numero no validonos muestra un mensaje de error
					if (numero == 1 || numero == 2) {
						OrdenarVector(vector, numero);
					} else
						System.out.println("Solo se admite 1 o 2.");
				}
			} else if (opcion == 6) {
				// sale del programa
				repetir = false;
			}
		}
		teclado.close();
	}

	// ************************************************************************************
	// ** Nombre de la función:EstaVacio
	// ** Explicación del que hace la función: comprueba si el vector esta vacio
	// ** Parámetros de entrada: int[](array de ints a comprovar)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static boolean EstaVacio(int[] vector) {
		if (vector[0] < 0)
			return true;
		else
			return false;
	}

	// ************************************************************************************
	// ** Nombre de la función:EstaLleno
	// ** Explicación del que hace la función: comprueba si el vector esta lleno
	// ** Parámetros de entrada: int[](array de ints a comprovar)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static boolean EstaLleno(int[] vector) {
		if (vector[vector.length - 1] >= 0)
			return true;
		else
			return false;
	}

	// ************************************************************************************
	// ** Nombre de la función:IntroducirElemento
	// ** Explicación del que hace la función: introduce un numero al primer numeor
	// negativo que encuantra
	// ** Parámetros de entrada: int[](array de ints), int(numero a introducir)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void IntroducirElemento(int[] vector, int valor) {
		// introduce el numero proporcionado a la primera posicion con un numero
		// negativo
		for (int i = 0; i < vector.length;) {
			if (vector[i] < 0) {
				vector[i] = valor;
				i = vector.length;
			} else
				i++;
		}
	}

	// ************************************************************************************
	// ** Nombre de la función:ListarVector
	// ** Explicación del que hace la función: Muestra el array de ints por
	// pantalla(solo numeros positivos)
	// ** Parámetros de entrada: int[]
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void ListarVector(int[] vector) {
		// muestra los numeros positivos por pantalla
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] >= 0)
				System.out.print(vector[i]);
			if (i < vector.length - 1)
				if (vector[i + 1] >= 0)
					System.out.print(", ");
		}
		System.out.println("\n\n");
	}

	// ************************************************************************************
	// ** Nombre de la función:QuitarElemento
	// ** Explicación del que hace la función: convierte el ultimo int positivo en
	// -1 para que no salga a la hora de printar el la array de ints
	// ** Parámetros de entrada: int[](array de ints del qual quitaremos el ultimo
	// int)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void QuitarElemento(int[] vector) {
		// quita el ultimo numero positivo del array cambiandolo por un -1
		for (int i = 1; i <= vector.length;) {
			if (vector[vector.length - i] >= 0) {
				System.out.println("El numero eliminado es: " + vector[vector.length - i]);
				vector[vector.length - i] = -1;
				i = vector.length + 1;
			} else
				i++;
		}
	}

	// ************************************************************************************
	// ** Nombre de la función:BuscarElemento
	// ** Explicación del que hace la función: busca el numero introducido en el
	// array de ints
	// ** Parámetros de entrada: int[](array de ints donde buscaremos el numero),
	// int(numero a buscar)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void BuscarElemento(int[] vector, int valor) {
		int x = 0;
		// comprueba si el numero introducido coincide con alguno de los numeros de la
		// array y dice su posicion, si no esta printa -1
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == valor) {
				System.out.println("El numero " + valor + " se encuantra en la posicion " + (i + 1) + ".");
				x = 1;
			} else if (vector[i] < 0) {
				i = vector.length;
			}
		}
		if (x == 0) {
			System.out.println("-1");
		}
		System.out.println("\n\n");
	}

	// ************************************************************************************
	// ** Nombre de la función:OrdenarVector
	// ** Explicación del que hace la función: ordena el vector en orden
	// ascendente(2) o descendente(1) dependiendo del numero introducido en el ent
	// de entrada
	// ** Parámetros de entrada: int[](array de ints a ordenar), int(1 o 2)
	// ** Parámetros de salida: void
	// ************************************************************************************
	static void OrdenarVector(int[] vector, int orden) {
		int temp = 0;
		if (orden == 1) {
			// ordena los numeros positivos de forma descendente
			for (int j = 0; j < vector.length; j++) {
				if (vector[j] < 0) {
					j = vector.length;
				} else {
					for (int i = 0; i < vector.length; i++) {
						if (vector[i] < 0) {
							i = vector.length;
						} else if (vector[i] < vector[j]) {
							temp = vector[j];
							vector[j] = vector[i];
							vector[i] = temp;
						}
					}
				}
			}
		} else if (orden == 2) {
			// ordena los numeros positivos de forma ascendente
			for (int j = 0; j < vector.length; j++) {
				if (vector[j] < 0) {
					j = vector.length;
				} else {
					for (int i = 0; i < vector.length; i++) {
						if (vector[i] < 0) {
							i = vector.length;
						} else if (vector[i] > vector[j]) {
							temp = vector[j];
							vector[j] = vector[i];
							vector[i] = temp;
						}
					}
				}
			}
		}
		System.out.println("\n\n");
	}
}
