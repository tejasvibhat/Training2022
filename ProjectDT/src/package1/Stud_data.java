package package1;

public class Stud_data {
	int rollno;
	int age;
	
	public void Display1() {
		System.out.println("Welcome to all of you");
	}
	
	public void Display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		Stud_data s1=new Stud_data();
		s1.rollno=17;
		System.out.println(s1.rollno);
		s1.age=12;
		System.out.println(s1.age);
		s1.Display1();
		s1.Display2();
				
	}

}
