package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
	
	System.out.println("\nWHILE - Contador ascendente");
	System.out.println("==============================");
	
	int x = 1;
	while(x <= 5 ) {
		
		System.out.println("BIENVENIDO " + x);
		
	x += 1;
	}
 
	System.out.println("\nWHILE - Contador descendente");
	System.out.println("==============================");
	
	int c = 5;
	while(c >= 1) {
		System.out.println("Bienvenido " + c);
		c--;
		
	}

	
	}

}
