package interview;

import java.util.ArrayList;

public class TestClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[3];
		ar[0] = 2;
		ar[1] = 3;
		ar[2] = 1;

		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int it : ar){
		al.add(it);
		al = null;
		}

	}

}
