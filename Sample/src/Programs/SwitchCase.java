package Programs;

public class SwitchCase {

	public static void main(String[] args) {
		int dayNo=4;
		String day;
		
		switch(dayNo) {
		case 1 :
			day="Monday";
			break;
		case 2 :
			day="Tuesday";
			break;
		case 3 :
			day="Wednesday";
			break;
		case 4 :
			day="Thursday";
			break;
		case 5 :
			day="Friday";
			break;
		case 6 :
			day="Saturday";
			break;
		case 7 :
			day="Sunday";
			break;
		default:
				day="holiday";
				break;
			
		}
		System.out.println("Day is\n"+ day);
	}

}
