package package1;

public class M_Parent1 {
	public void one() {
		this.four(30, 60, 90);
		System.out.println("Default Parent Method");
	}
	public void sec(int a) {
		this.one();
		System.out.println("1 parameterized Parent method");
	}
	public void three(int a,int b) {
		this.sec(32);
		System.out.println("2 parameterized Parent method");
	}
	public void four(int a,int b,int c) {
		System.out.println("3 parameterized Parent method");
		
	}

}
