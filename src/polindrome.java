
public class polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  t = "" ;
		int n  = 5451;
		String s = String.valueOf(n);
		for(int i = s.length() - 1; i >=0 ; i --) {
			t =  t + s.charAt(i);
			
		}
		System.out.println(t);
		if(s.equals(t)) {
			System.out.println("polindrmoe");
		}
		else {
			System.out.println("not polindrome");
		}
	}
	
	

}
