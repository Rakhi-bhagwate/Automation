package Programs;

interface Demo{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);

	
}
class Bicycles implements Demo{
	int speed;
	int gear;
	public void changeGear(int newGear) {
		gear = newGear;
	}
	public void speedUp(int increment){ 
        
        speed = speed + increment; 
    } 
	 public void applyBrakes(int decrement){ 
         
	        speed = speed - decrement; 
	    } 
	 public void display() { 
         System.out.println("speed: " + speed 
              + " gear: " + gear); 
    }       
	
}
public class InterfaceExp {

	public static void main(String[] args) {
		
		Bicycles b = new Bicycles();
		b.changeGear(4);
		b.speedUp(9);
		b.applyBrakes(2);
		System.out.println("Bicycle present state:");
		b.display();
	}

}
