package interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str3 = "I love my country Hi", newStr = null;
		//oip- I Love My Country Hi
		
		String firstString; 
		String remainString = null;
		String sArray[] = str3.split(" ");
		
		
		for(int i = 0 ; i < sArray.length ; i ++) {
		firstString = sArray[i].substring(0, 1);
		
		firstString = sArray[i].substring(0,1).toUpperCase();
		remainString = sArray[i].substring(1);
		
		newStr = firstString + remainString;
		System.out.print(newStr + " ");
	}
		
		
		

	}

}
