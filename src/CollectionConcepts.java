import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionConcepts {
	
	
	public static void HashMapP() {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,  "a");
		hm.put(2,  "b");
		hm.put(3,  "c");
		hm.put(4,  "d");
		
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			if(hm.get(i).equals("d")) {
				System.out.println("printing : " + hm.get(i));
			}
		}
	}

	public static void main(String[] args) {
		HashMapP();
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(7);
		al.add(4);
		al.add(7);
		al.add(5);
		al.add(4);
		
		
		
		CopyOnWriteArrayList<Integer> ca = new CopyOnWriteArrayList<Integer>(al);
		Iterator<Integer> it1 = ca.iterator();
		while( it1.hasNext()) {
			 int i = it1.next();
			 System.out.println("Synronized Array list : " + i);
			 
			 
		}
Set<Integer> st = new HashSet<Integer>(al);
		
		Iterator<Integer> it = st.iterator();
		while( it.hasNext()) {
			 int i = it.next();
			 System.out.println("After duplicate removal : " + i);
			 
			 
		}

	}

}
