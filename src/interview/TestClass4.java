package interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// removing duplicate character
		
		String str = "a b c aabcc cb";
		
		// approach 1
		
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < str.length() ; i++) {
			char c = str.charAt(i);
			int index = str.indexOf(c, i + 1);
			if(index == -1) {
				sb.append(c);
			}
		}
		System.out.println(sb);
		
		//approach 2
		
		StringBuilder sb1 = new StringBuilder();
		Set<Character> st = new LinkedHashSet<Character>();
		
		for(int i=0; i< str.length(); i++) {
			st.add(str.charAt(i));
		}
		for(Character c1 : st) {
			sb1.append(c1);
		}
System.out.println(sb1);
	}

}
