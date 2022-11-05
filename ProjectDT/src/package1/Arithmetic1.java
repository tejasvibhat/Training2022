package package1;

public class Arithmetic1 {
	public int Sum(int a,int b) {
		int c;
		c=a+b;
		return c;
	}
	public int Sub(int d,int e) {
		int f;
		f=d-e;
		return f;
	}
	public int Mul(int j,int k) {
		int l;
		l=j*k;
		return l;
	}
	public void Div(int g,int h) {
		int i;
		i=g/h;
		System.out.println(+i);
	}
	public static void main(String[] args) {
		Arithmetic1 ari=new Arithmetic1();
		int first=ari.Sum(10, 2);
		int second=ari.Sum(first, 2);
		int third=ari.Sub(second, 2);
		int fourth=ari.Mul(third,2);
		System.out.println("Print the result for (((((10+2)+2)-2)*2)/2)");
		ari.Div(fourth, 2);
	}
}
