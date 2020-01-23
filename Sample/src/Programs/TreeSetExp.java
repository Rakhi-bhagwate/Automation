package Programs;

import java.util.TreeSet;

public class TreeSetExp {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		set.add(16);
		set.add(96);
		set.add(36);
		set.add(46);
		System.out.println("Value1:"+ set.pollFirst());
		System.out.println("Value2:"+ set.pollLast());
		
	}

}
