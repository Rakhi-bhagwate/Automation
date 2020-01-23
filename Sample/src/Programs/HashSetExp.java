package Programs;

import java.util.HashSet;

public class HashSetExp {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Sankalp");
		set.add("Shruti");
		set.add("Sanket");
		set.add("Sankalp");
		java.util.Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
