package interview;

public class TestClass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: My name is Shruti
		//op- it urhS si emanyM
		//Input- This is an interview
		// output- weiv re tn inassihT
		String str = "My name is Shruti";
		char cr[] = str.toCharArray();
		for(char it : cr) {
			if(it == ' ' ) {
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() -1 ; i>0 ; i--) {
			char c = str.charAt(i);
			sb.append(c);
			System.out.println(sb);
		}

	}
	
	public static void main(String[] args, String s) {
		
	}

}
