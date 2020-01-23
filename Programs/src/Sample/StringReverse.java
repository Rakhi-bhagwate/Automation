package Sample;

public class StringReverse {

	public static void main(String[] args) {
		String name= "Selenium";
		String number= "57368";
		StringBuilder name1 = new StringBuilder();
		name1.append(name);
		name1 = name1.reverse();
		System.out.println(name1);

		StringBuilder number1 = new StringBuilder();
		number1.append(number);
		number1 = number1.reverse();
		System.out.println(number1);
	}
}
