package ejercicios;

import java.util.Scanner;

public class EjercicioII1 {

	public static void main(String args[]) {

		float[] estatura = new float[5];
		float suma = 0;
		int altos = 0, bajos = 0;
		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println("introduce la altura de empleado " + (i + 1));

				estatura[i] = sc.nextFloat();
				suma = suma + estatura[i];
			}
			float media = suma / 5;
			for (int i = 0; i < 5; i++) {

				if (estatura[i] > media) {
					altos += 1;
				}

				else if (estatura[i] < media) {
					bajos += 1;
				}
			}

			System.out.println("el promedio de la altura es: " + media);
			System.out.println("Hay " + altos + " personas mas altas que el promedio y " + bajos + " mas bajos");
			sc.close();
		} catch (Exception e) {
			System.out.println("No es un número valido, el numero introducido debe seguir este formato: 'x,y'");

		}
	}
}