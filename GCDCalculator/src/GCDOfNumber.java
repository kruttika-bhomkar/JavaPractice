import java.util.Scanner;

public class GCDOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int res=gcd(m, n);
		
		System.out.println("GCD of "+m+" and "+n+" is= "+res);
		}
	public static int gcd(int m,int n) {
		while(n!=0) {
			int res=m%n;
			m=n;
			n=res;
		}
		return m;
	}
}

