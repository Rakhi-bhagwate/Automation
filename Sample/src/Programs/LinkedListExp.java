package Programs;

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {
		
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.addLast("C");
		obj.addFirst("D");
		obj.add(2, "E"); 
        obj.add("F"); 
        obj.add("G"); 
        System.out.println("Linked list : " + obj);

        obj.remove("B"); 
        obj.remove(3); 
        obj.removeFirst(); 
        obj.removeLast(); 
        System.out.println("Linked list after deletion: " + obj); 
  
        boolean status = obj.contains("E");
        if(status)
        	System.out.println("List contains E");
        else
        	System.out.println("list does not contain E");
        
        int size = obj.size(); 
        System.out.println("Size of linked list = " + size);
        
        Object element = obj.get(2); 
        System.out.println("Element returned by get() : " + element); 
        obj.set(2, "Y"); 
        System.out.println("Linked list after change : " + obj); 
  
	}
	
	

}
