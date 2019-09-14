package com.Unorganized.Defaults;

public class TestTryCatch {
	
	public static void main(String[] args) {
		try {
			int save=1/0;
		}
		catch(Exception ar) {
			ar.getMessage();
		}
		finally {
			try {
				int save_again=1/0;
			}
			catch(Exception ar) {
				ar.getMessage();
			}
			finally {
				System.out.println("Success");			
			}
		}
	}

}
