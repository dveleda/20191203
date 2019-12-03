package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio3 {

	/* 3 puntos
	 * 
	 * Decimos que un número entero positivo es guay si puede obtenerse como suma de dos o más números
	 * enteros consecutivos. Por ejemplo, 3 (=1+2), 5 (=2+3), 6(=1+2+3), son números guays.
	 * 
	 * Escribir en el método main un programa que lea un número entero positivo e indique si éste es guay.
	 * 
	 * 
	 */
	
	private static Scanner teclado;

	public static void main(String[] args) {
		int x=0;
		int y = 0;
		int sum = 0;
	

		teclado = new Scanner(System.in);
		System.out.println("Numero 1: ");
		x=teclado.nextInt();
if(x>=0){
		do {
		x=y;	
		x=x+1;
		sum=sum+x;

		} while (x==y+1);
		
		System.out.print("Tu numero es guay" + sum);
	}
	}

}
