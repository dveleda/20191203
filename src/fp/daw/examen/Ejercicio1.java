package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio1 {

	/* 
	 * 4 puntos
	 * 
	 * Escribir en el método main un programa que pida por teclado un número decimal menor o igual
	 * que 3000 y muestre por pantalla el resultado de convertirlo a un número romanos.
	 *     
	 *     La conversión se realizará transformando individualmente cada dígito, empezando por el correspondiente
	 *     a las unidades de millar, seguido de las centenas, decenas y unidades de la forma siguiente:
	 *     
	 *     		Dígito decimal		|	Transformación
	 *     		--------------------|----------------------------------------------------------------------------
	 *     		1, 2 o 3			|	Escribir C1 de una a tres veces
	 *     		4					|	Escribir C1 seguido de C2
	 *     		5, 6, 7 o 8			|	Escribir una vez C2 seguido de C1 de cero a tres veces
	 *     		9					|	Escribir C1 seguido de C3
	 *     
	 *     donde C1, C2 y C3 son los caracteres de numeración romana que corresponda según la tabla siguiente:
	 *     
	 *     							|   C1   |   C2   |   C3   |
	 *     		--------------------|--------|--------|--------|        
	 *     		unidades			|	I    |   V    |   X    |
	 *     		decenas				|	X    |   L    |   C    |
	 *     		centenas			|	C    |   D    |   M    |
	 *     		unidades de millar	|	M    |        |        |
	 *     
	 *     Sólo se permite el uso de recursos del lenguaje Java vistos en las unidades 2 y 3.
	 */

	public static void main(String[] args) {
		
		import java.util.Scanner;

		public class NumeroRom {

		  public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      int Num;
		      do {
		             System.out.print("Introduce un n�mero entre 1 y 3000: ");
		             Num = sc.nextInt();
		      } while (N < 1 || Num >= 3000);
		      System.out.println(Num + " en numeros romanos -> " + conversionANumerosRomanos(N));
		  }

		  
		  public static String conversionANumerosRomanos(int numero) {
		      int i, miles, centenas, decenas, unidades;
		      String romano = "";
		   
		      miles = numero / 1000;
		      centenas = numero / 100 % 10;
		      decenas = numero / 10 % 10;
		      unidades = numero % 10;

		     //millar
		      for (i = 1; i <= miles; i++) {
		             romano = romano + "M";
		      }

		     //centenas
		      if (centenas == 9) {
		          romano = romano + "CM";
		      } else if (centenas >= 5) {
		                     romano = romano + "D";
		                     for (i = 6; i <= centenas; i++) {
		                            romano = romano + "C";
		                     }
		      } else if (centenas == 4) {
		                      romano = romano + "CD";
		      } else {
		                  for (i = 1; i <= centenas; i++) {
		                         romano = romano + "C";
		                  }
		      }

		     //decenas
		      if (decenas == 9) {
		           romano = romano + "XC";
		      } else if (decenas >= 5) {
		                      romano = romano + "L";
		                      for (i = 6; i <= decenas; i++) {
		                            romano = romano + "X";
		                      }
		      } else if (decenas == 4) {
		                      romano = romano + "XL";
		      } else {
		                    for (i = 1; i <= decenas; i++) {
		                           romano = romano + "X";
		                    }
		      }

		     //unidades
		      if (unidades == 9) {
		           romano = romano + "IX";
		      } else if (unidades >= 5) {
		                      romano = romano + "V";
		                      for (i = 6; i <= unidades; i++) {
		                             romano = romano + "I";
		                      }
		      } else if (unidades == 4) {
		                      romano = romano + "IV";
		      } else {
		                  for (i = 1; i <= unidades; i++) {
		                         romano = romano + "I";
		                  }
		      }
		      return romano;
		  }
		}
			
		}
		
		
		
	}
	
}
