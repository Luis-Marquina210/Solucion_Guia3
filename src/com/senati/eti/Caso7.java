package com.senati.eti;
import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Nombre......: ");
		String nombre = sc.nextLine();
		
		System.out.println("\nFOR ASCENDENTE");
		System.out.println("=================");
		// Para x = 1 hasta  hacer
		// for ascendente de 1 a 10
		for(int x = 1; x <= 10; x++)
			System.out.println( x +".-Bienvenido(a) " + nombre + " al curso.");
		
		
		System.out.println("\nFOR DESCENDENTE");
		System.out.println("=================");
		// Para x = 10 Hasta 1 Hacer con paso 2
		// for descendente disminuye de 2 en 2
		for(int i = 10; i >= 0; i -= 2) {
			System.out.println(i);
		
		}
		
		
		
		
		
		
	}

}
