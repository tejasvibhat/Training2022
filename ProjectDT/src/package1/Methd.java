package package1;

public class Methd {
	public void one() {
		this.four(1, 2, 3);
		System.out.println("Default Method");
	}
	public void sec(int a) {
		this.five(1, 2, 3, 4);
		System.out.println("one parameterized method");
	}
	public void three(int a,int b) {
	    this.sec(1);
		System.out.println("two parameterized method");
	}
	public void four(int a,int b,int c) {
		System.out.println("three parameterized method");
		
	}
	public void five(int a,int b,int c,int d) {
		this.one();
		System.out.println("four parameterized method");
		
	}
	public static void main(String[] args) {
		Methd meth = new Methd();
		meth.three(1, 2);
	}
}
