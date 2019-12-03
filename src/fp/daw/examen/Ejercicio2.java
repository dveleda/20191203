package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * 3 puntos
	 * 
	 * Escribir en el método main un programa que lea del teclado dos números enteros y calcule
	 * la suma de todos los números impares comprendidos entre ellos, ambos incluidos.
	 * 
	 * El programa deberá calcular el resultado sin importar el orden en que se introduzcan los dos números
	 * (primero el mayor o primero el menor).
	 * 
	 * Si es posible, minimizar el número de iteraciones que se ejecutarán para obener el resultado.
	 * 
	 * No se permite el uso de la clase Scanner para leer del teclado.
	 * 
	 * Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int numero1=0;
		int numero2;
		int sumaImpar=0;
		int impar;
		System.out.println("Introduce un numero");
		 numero1=sc.nextInt();
		System.out.println("Introduce otro numero");
		 numero2=sc.nextInt(); 
		 
		 
		 for(int i=0;numero1==numero2; i++ ) {
			 if (numero1%2==1)

			 {
			     impar = numero1 + 2;
			     sumaImpar=sumaImpar + numero1;

			         System.out.println("la suma es:"+impar);
			     {

			 }
			     
			 }
			 
		 
			 
			 System.out.println("la suma de tus impares es:" +sumaImpar);
		
			 
		 }
		 
		 
		
	}

}

