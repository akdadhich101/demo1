package interview;

import java.util.Iterator;
import java.util.TreeSet;

public class TestClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i/p - 0,1,0,1,1,0,0,1
		
		
		
		int tmp ; 
		int ar[] = new int[] {0,1,0,1,1,0,0,1};
		
		for(int i = 0; i < ar.length - 1 ; i ++) {
			for(int j = i +1; j < ar.length - 1 ; j ++)
			if(ar[i] > ar[j]) {
				tmp = ar[i];
				ar[i] = ar[j];
				ar[j] = tmp;
				
			}
			System.out.println(ar[i]);
		}

	}

}
