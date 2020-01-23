package Programs;

public class Overloading {
	public int sum(int x, int y) {
		return(x+y);
	}
	public int sum(int x, int y, int z) {
		return(x+y+z);
	}
	public double sum(double x, double y) {
		return(x+y);
	}
	

	public static void main(String[] args) {
		Overloading over = new Overloading();
		System.out.println(over.sum(10, 20));
		System.out.println(over.sum(10, 20,30));
		System.out.println(over.sum(10.9, 20.8));
		
		
	}

}
