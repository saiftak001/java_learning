package com.datastructures.arrays;

import java.io.IOException;
import java.util.Scanner;

public class ArrayRotation {
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String name=reader.readLine(); int number=reader.read(); double dbl=
		 * reader.read();
		 */
		System.out.println("start input\n");

		
		Scanner scan= new Scanner(System.in);

		double dbl= scan.nextDouble();
		
		scan.nextLine();
		
		String str=scan.nextLine();
		
		int i= scan.nextInt();
				
		scan.close();
		
		System.out.println(i+"\n"+dbl+"\n"+str );
		
	}

}
