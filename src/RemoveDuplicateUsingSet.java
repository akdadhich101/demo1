import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "My Name is ajay";
		
		char c[] = s.toCharArray();
		Arrays.sort(c);
		
		for(int i = 0; i < c.length; i ++) {
			System.out.println(c[i]);
		}
		
		LinkedHashSet<Character>  ls = new LinkedHashSet<Character>();
		for(char cr : c) {
			ls.add(cr);
			
		}
		System.out.println(ls);
		
		
		if(ls.contains('n')) {
			System.out.println("yes found with contains in whole collection");
		}
		for(Character l: ls) {
			System.out.println(l);
			if(l.equals('N')) {
				System.out.println("yes found with iterator equal");
			}
		}
		

	}

}
