package com.Unorganized.Defaults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
//		int theInt= reader.read();
		
		String theString=reader.readLine();
		
		System.out.println(" "+theString);
		
	}

}
