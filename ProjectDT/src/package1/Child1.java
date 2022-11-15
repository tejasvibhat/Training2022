package package1;

public class Child1 extends Parent1 {
	public Child1() {
		this(11,22);
		System.out.println("Default Child Constructor");
	}
	public Child1(int a) {
		this();
		System.out.println("one parameterized child constructor");
	}
	public Child1(int a, int b) {
		super(22,33);
		System.out.println("two parameterized child constructor");
	}
	public Child1(int a,int b, int c) {
		this(10);
		System.out.println("three parameterized child constructor");
	}
	
	public static void main(String[] args) {
		Child1 ch=new Child1(12,15,18);
	}

}
