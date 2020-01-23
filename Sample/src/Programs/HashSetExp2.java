package Programs;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExp2 {

	public static void main(String[] args) {
		// java hashset from another collection
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rakhi");
		list.add("Paridhi");
		list.add("Apurva");
		
		HashSet<String> set = new HashSet(list);
		set.add("Sankalp");
		java.util.Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
