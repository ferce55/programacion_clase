package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int longitud = str.length();
		str = str.toLowerCase();
		boolean palindromo = false;
		char caracterIni, caracterFin;
		for (int i = 0; i < (longitud / 2); i++) {
			caracterIni = str.charAt(i);
			caracterFin = str.charAt(longitud - 1 - i);

			if (caracterIni == caracterFin)
				palindromo = true;
			else
				palindromo = false;

			System.out.println(palindromo);
		}

		if (palindromo)
			System.out.println("la string es un palindromo");
		else
			System.out.println("la string no es un palindromo");

		sc.close();
	}

}
