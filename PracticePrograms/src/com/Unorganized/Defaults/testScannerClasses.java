package com.Unorganized.Defaults;

import java.util.Scanner;

public class testScannerClasses {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter integer : ");

		int theInt = scanner.nextInt();

		System.out.println("Enter next String : ");

		String theString = scanner.next();

		System.out.println("Enter Line String : ");

		String theLineString = scanner.nextLine();

		System.out.println("int : " + theInt + "\ntheNextString : "+theString + "\ntheLineString : " + theLineString);

		scanner.close();
	}

}
