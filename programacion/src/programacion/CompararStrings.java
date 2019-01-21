package programacion;

import java.util.Scanner;

public class CompararStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroStrings = 5;
		pedirString(numeroStrings);
	}

	public static int contarVocales(String str, int longitud) {
		int numeroVocales = 0;
		for (int i = 0; i < longitud; i++) {
			str = str.toLowerCase();
			char caracter = str.charAt(i);
			if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) {
				numeroVocales++;
			}
		}
		System.out.println("numero de vocales: " + numeroVocales);
		return numeroVocales;
	}

	public static int longitudCadena(String str) {
		int longitud = str.length();
		System.out.println("La longitud del string es: " + longitud);
		return longitud;
	}

	public static void pedirString(int fin) {
		int longitud[] = { 0, 0, 0, 0, 0 };
		int vocales[] = { 0, 0, 0, 0, 0 };

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < fin; i++) {
			System.out.println("introduce la string " + (i + 1));
			String str = sc.nextLine();
			longitud[i] = longitudCadena(str);
			vocales[i] = contarVocales(str, longitud[i]);
		}
		
		for(int i = 0; i<fin; i++){
			System.out.println("el array " + (i+1) + " mide " + longitud[i] + " y tiene vocales tiene: " + vocales[i]);
		}
		sc.close();
	}

}
