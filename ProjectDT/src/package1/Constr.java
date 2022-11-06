package package1;

public class Constr {
	public Constr() {
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	public Constr(int a) {
		this();
		System.out.println("one parameterized constructor");
	}
	public Constr(int a,int b) {
		this(1,2,3);
		System.out.println("two parameterized constructor");
	}
	public Constr(int a,int b,int c) {
		this(1);
		System.out.println("three parameterized constructor");
	}
	public Constr(int a,int b,int c,int d) {
		
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		Constr con=new Constr(1,2);
	}
}
