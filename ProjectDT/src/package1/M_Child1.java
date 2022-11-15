package package1;

public class M_Child1 extends M_Parent1 {
	public void Mone() {
		this.Mthree(12, 24);
		System.out.println("Default Child Method");
	}
	public void Msec(int a) {
		super.three(10, 20);
		System.out.println("1 parameterized Child method");
	}
	public void Mthree(int a,int b) {
		this.Mfour(36, 48, 60);
		System.out.println("2 parameterized Child method");
	}
	public void Mfour(int a,int b,int c) {
		this.Msec(72);
		System.out.println("3 parameterized Child method");
		}
	public static void main(String[] args) {
		M_Child1 ch=new M_Child1();
		ch.Mone();
	}
}
