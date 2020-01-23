package Programs;
class Vehicle{
	int maxSpeed = 120;
}
class Car extends Vehicle{
	int maxSpeed = 180;

void display() {
	System.out.println("Max speed is"+ super.maxSpeed);
}
}
public class SuperVariable {

	public static void main(String[] args) {
		Car small = new Car();
		small.display();

	}

}
