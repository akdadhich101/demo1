package com.qa.finalize;

public class FinalizeClass {

	public void finalize() {
		System.out.println("called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalizeClass fl1 = new FinalizeClass();
		FinalizeClass fl2 = new FinalizeClass();
		
		fl2 = null;
		
		System.out.println(fl1);
		System.out.println(fl2);
		
		System.gc();

	}

}
