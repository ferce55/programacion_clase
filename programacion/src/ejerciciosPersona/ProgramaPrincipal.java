package ejerciciosPersona;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Persona P1 = new Persona();
		P1.setNombre("Paco");
		P1.setTelefono("123456789");
		P1.setEdad(18);
		P1.imprimir();

		Persona P2 = new Persona();
		Scanner sc = new Scanner(System.in);
		P2.setNombre(sc.nextLine());
		P2.setTelefono(sc.nextLine());
		P2.setEdad(sc.nextInt());
		int Edad1 = P1.getEdad();
		int Edad2 = P2.getEdad();
		if (Edad1 < Edad2) {
			System.out.println(P1.getNombre());
		} else {
			System.out.println(P2.getNombre());
		}

		agenda();

		sc.close();
	}

	public static void agenda() {
		System.out.println("dime el numero de datos que vas a introducir");
		Scanner scn = new Scanner(System.in);
		Scanner sct = new Scanner(System.in);
		Scanner sce = new Scanner(System.in);
		Scanner scu = new Scanner(System.in);
		int nNumeros = sce.nextInt();
		Persona[] P = new Persona[nNumeros];

		for (int i = 0; i < nNumeros; i++) {

			P[i] = new Persona();
			System.out.println("dime el nombre de la persona");
			P[i].setNombre(scn.nextLine());
			System.out.println("dime el numero de telefono de la persona");
			P[i].setTelefono(sct.nextLine());
			System.out.println("dime la edad de la persona");
			P[i].setEdad(sce.nextInt());
		}

		for (int i = 0; i < nNumeros; i++) {
			P[i].imprimir();
		}

		scn.close();
		sct.close();
		sce.close();
		scu.close();
	}

}
