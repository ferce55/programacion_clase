package programacion;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n, i,t1=1, t2=0, s=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero y mostrare la serie de fibonacci hasta esa posicion");
		n = sc.nextInt();
		for (i=1;i>=n;i++){
			System.out.println(s);
			t1 = t2;
			t2 = s;
			s = t1+t2;
		}

	}
}	
