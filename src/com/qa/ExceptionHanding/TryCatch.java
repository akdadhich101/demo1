package com.qa.ExceptionHanding;

public class TryCatch {

	public static void  custom() {
		int i =0;
		if( i == 0 ) {
		try {
		throw new Exception("my custom exception");
		}
		
		catch(Exception e ) { 
			e.printStackTrace();
			System.out.println("after exception");
		
		}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		custom();

	}
	

}
