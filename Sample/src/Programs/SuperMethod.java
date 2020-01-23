package Programs;
class Person{
void message() {
	System.out.println("This is person class");
}
}
class Children extends Person{
	void message() {
		System.out.println("This is student class");
	}
	void display() {
		message();
		super.message();
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Children s = new Children();
		s.display();
		
	}

}
