package package1;

public class Parent1 {
	public Parent1() {
		this(10,20,30);
		System.out.println("Default Parent Constructor");
	}
	public Parent1(int a) {
		this();
		System.out.println("one parameterized parent constructor");
	}
	public Parent1(int a, int b) {
		this(55);
		System.out.println("two parameterized parent constructor");
	}
	public Parent1(int a,int b, int c) {
		System.out.println("three parameterized parent constructor");
	}
	
	public static void main(String[] args) {
		
	}

}
