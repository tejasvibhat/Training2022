package package1;
public class Arithmetic2 {
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
		System.out.println("Print the output for (((((10*2)+2)-2)-2)/2) = "+i);
	}
	public static void main(String[] args) {
		Arithmetic2 cal=new Arithmetic2();
		int mul=cal.Mul(10, 2);
		int add=cal.Sum(mul, 2);
		int sub=cal.Sub(add, 2);
		int sub1=cal.Sub(sub, 2);
		cal.Div(sub1, 2);
	}
}
