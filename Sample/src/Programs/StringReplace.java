package Programs;

public class StringReplace {

	public static void main(String[] args) {
		String name= new String("Selenium357");
		System.out.println(name);
		String name1 = name.replaceFirst("eni", "Abc");
		System.out.println(name1);
		
		System.out.println(name1.replaceFirst("357","587" ));

	}

}
