package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce una string y un caracter y se mostrara el numero de veces que se repite ese caracter");
		String str = sc.nextLine();
		char crc = sc.next().charAt(0);
		int nRep = contarCaracter(str,crc);
		System.out.println("el caracter " + crc + " aparece este numero de veces: " + nRep);
		sc.close();
	}
	
	public static int contarCaracter(String str, char crc){
		int longitud = str.length();
		int nRep = 0;
		str = str.toLowerCase();
		for (int i=0; i<longitud; i++){
			char caracter = str.charAt(i);
			if( crc == caracter ){
				nRep ++;
			}
		}
		
		
		return nRep;
	}
}
