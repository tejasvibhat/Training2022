package package1;

import java.util.Scanner;

public class ScanAssign {
	public int sum(int a,int b) {
		int c=a+b;
		return c;	
	}
	public int sub(int d,int e) {
		int f=d-e;
		return f;
	}
	public int mul(int g,int h) {
		int i=g*h;
		return i;
	}
	public void div(int j,int k) {
		int l=j/k;
		System.out.println("Output is "+l);
	}
	public static void main(String[] args) {
		System.out.println("Expression:(((((x1+x2)+x3)-x4)*x5)/x6)");
		ScanAssign sa=new ScanAssign();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for x1:");
		int x1=s.nextInt();
		System.out.println("Enter value for x2:");
		int x2=s.nextInt();
		int sum=sa.sum(x1, x2);
		System.out.println("Enter value for x3:");
		int x3=s.nextInt();
		int sum1=sa.sum(sum, x3);
		System.out.println("Enter value for x4:");
		int x4=s.nextInt();
		int sub1=sa.sub(sum1, x4);
		System.out.println("Enter value for x5:");
		int x5=s.nextInt();
		int mul1=sa.mul(sub1, x5);
		System.out.println("Enter value for x6:");
		int x6=s.nextInt();
		sa.div(mul1, x6);
	}
}
