package Programs;

public class StringRevFun {

	public static void main(String[] args) {
		String name="Valuelabs";
		char val[] = name.toCharArray();
		for(int i=val.length-1;i>=0;i--) {
			System.out.println(val[i]);
		}

	}

}
