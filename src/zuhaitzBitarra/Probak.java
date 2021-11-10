package zuhaitzBitarra;

import java.io.File;
import java.util.Scanner;


import java.util.LinkedList;


public class Probak {
	
	public static void main(String[] args) throws Exception {
		int elem;
		String fitxIzena;
		ZuhaitzBitarra z0, z1, z2, z3, z4;

		fitxIzena = "datuak/zuhaitza0.txt";
		Scanner input = new Scanner(new File(fitxIzena));		
		z0 = new ZuhaitzBitarra(input);
		fitxIzena = "datuak/zuhaitza1.txt";
		input = new Scanner(new File(fitxIzena));		
		z1 = new ZuhaitzBitarra(input);
		fitxIzena = "datuak/zuhaitza2.txt";
		input = new Scanner(new File(fitxIzena));		
		z2 = new ZuhaitzBitarra(input);
		fitxIzena = "datuak/zuhaitza3.txt";
		input = new Scanner(new File(fitxIzena));		
		z3 = new ZuhaitzBitarra(input);
		fitxIzena = "datuak/zuhaitza4.txt";
		input = new Scanner(new File(fitxIzena));		
		z4 = new ZuhaitzBitarra(input);

		System.out.println("EGITURA BEREKOAK: ");
		System.out.println(z3);
		System.out.println(z3);
		boolean egituraBera = z3.egituraBerekoak(z3);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z3);
		System.out.println(z4);
		egituraBera = z3.egituraBerekoak(z4);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z4);
		System.out.println(z4);
		egituraBera = z4.egituraBerekoak(z4);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z1);
		System.out.println(z1);
		egituraBera = z1.egituraBerekoak(z1);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z1);
		System.out.println(z2);
		egituraBera = z1.egituraBerekoak(z2);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z0);
		System.out.println(z1);
		egituraBera = z0.egituraBerekoak(z1);
		System.out.println(egituraBera);
		System.out.println("--------");
		System.out.println(z0);
		System.out.println(z0);
		egituraBera = z0.egituraBerekoak(z0);
		System.out.println(egituraBera);

		System.out.println();
		System.out.println("ETIKETATU: ");
		System.out.println(z0);
		z0.etiketatu();
		System.out.println("Etiketatuta: " + z0 +"\n");
		System.out.println(z1);
		z1.etiketatu();
		System.out.println("Etiketatuta: " + z1 +"\n");
		System.out.println(z2);
		z2.etiketatu();
		System.out.println("Etiketatuta: " + z2 +"\n");
		System.out.println(z3);
		z3.etiketatu();
		System.out.println("Etiketatuta: " + z3 +"\n");
		System.out.println(z4);
		z4.etiketatu();
		System.out.println("Etiketatuta: " + z4 +"\n");
		input.close();
	}
}