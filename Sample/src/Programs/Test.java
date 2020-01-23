package Programs;

class MountainBike extends Bicycle  
{ 
      public int seatHeight; 
      public MountainBike(int gear,int speed,int startHeight) 
    { 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
   public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
      
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 

public class Test {

	public static void main(String[] args) {
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());
	}

}
