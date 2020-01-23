package Programs;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		java.util.Iterator<String> iterator =  list.iterator();
		System.out.println("List elements:");
		while(iterator.hasNext())
			System.out.println(iterator.next()+"");	
		System.out.println();
	}

}
