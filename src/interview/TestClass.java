package interview;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123";
		int i = 432;
		// Convert int to string
		String str  = String.valueOf(i);
		System.out.println(str +100);
		
		// Convert string to int
		
		int newInt = Integer.parseInt(s);
		
		System.out.println(newInt + 100 );
		
		// Split string by world
		String str1 = "my new car is alto is a brand";
		
		
		char c = str1.charAt(11); 
		System.out.println(c);
		
		String[] sar = str1.split(" ");
		
		int sarLen = sar.length;
		System.out.println(sarLen);
		
		for(int i1 = 0; i1 < sarLen ; i1 ++) {
			//System.out.println(sar[i1]);
			System.out.println(sar[i1].compareTo("car"));
		}
		
		
		

	}

}
