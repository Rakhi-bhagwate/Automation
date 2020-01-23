package Programs;

public class CountObjects {
	
	static int count;
	CountObjects(){
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountObjects c1 = new CountObjects();
		CountObjects c2 = new CountObjects();
		CountObjects c3 = new CountObjects();
		CountObjects c4 = new CountObjects();
		CountObjects c5 = new CountObjects();
		CountObjects c6 = new CountObjects();
		System.out.println("The no. of objects:"+ count);
		
	}

}
