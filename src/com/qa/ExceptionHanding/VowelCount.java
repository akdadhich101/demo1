package com.qa.ExceptionHanding;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(vowel("ajay"));

	}
	public static int vowel(String s) {
		int count = 0;
		for( int i = 0 ; i < s.length() ; i ++ ) {
			char c = s.charAt(i);
			if(c == 'a' || c == 'i' || c =='o' || c == 'u') {
				count ++ ; 
			}
		}
		return count;
		
	}

}
