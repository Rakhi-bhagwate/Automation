package Programs;

class Student{
	String name;
	int rollNo;
	static String clgName;
	static int counter = 0;
	public Student(String name) {
		this.name= name;
		this.rollNo= setRollNo();
	}
	static int setRollNo() {
		counter++;
		return counter;
	}
	static void setClg(String name) {
		clgName = name;
	}
	void getStudentInfo() {
		System.out.println("name : " + this.name); 
        System.out.println("rollNo : " + this.rollNo);
        System.out.println("cllgName : " + clgName); 
	}
	
}

public class staticExp {

	public static void main(String[] args) {
		Student.setClg("RCOEM");
		Student s1 = new Student("Shruti");
		Student s2 = new Student("Sankalp");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}

}
