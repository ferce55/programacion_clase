package programacion;

import java.util.Scanner;

public class NumerosPrimos {
	
	public static void primos (int b, int a){
		int e=0, c=a;
		if(c>b){
			System.out.println("");
			System.out.println("Fin");
		}else{
			for (int d=a-1;d>=1;d--){
				if(c%d==0){
					e++;
				}
			}
			if(e<2){
				System.out.println("");
				System.out.println(c);
			}
			
			primos(b, a+1);
		}
	}

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Escribe dos números y se mostrarán la cantidad de primos que hay entre los dos");
		
		int a=0, b=0, mayor, menor;
		a=teclado.nextInt();
		b=teclado.nextInt();
		if (a==b){
			mayor=a;
			menor=a;
		}else if (a>b){
			mayor=a;
			menor=b;
		}else{
			mayor=b;
			menor=a;
		}
		primos (mayor,menor);
		teclado.close();
	} 
	
}

