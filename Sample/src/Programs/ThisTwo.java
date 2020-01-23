package Programs;
class ThisTwo{
	int a;
	int b;
	ThisTwo(){
		this(10,20);
		System.out.println("Inside default constructor\n");
	}
	ThisTwo(int a,int b){
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterised constructor");
	}

public static void main(String[] args) {
		ThisTwo tt = new ThisTwo();

	}

}
