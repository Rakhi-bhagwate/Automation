package Programs;
abstract class Ball {    
    void fun() { System.out.println("Base fun() called"); } 
} 

class Doggy extends Ball { } 

public class AbsMethod {

	public static void main(String[] args) {
		Doggy de = new Doggy();
		de.fun();
//		int arr[] = new int[] {1,2,3,4};
//		for(int i=0;i<=2;i++) {
//			System.out.println(arr[i]);
//		}

	}
}
