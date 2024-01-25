import java.util.Scanner;

public class FibbinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		int range=sc.nextInt();
		FSeries(range);
		
		
	}
	public static void FSeries(int range) {
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2);
			for(int i=3;i<=range;i++) {
				int nextNo=fib1+fib2;
				fib1=fib2;
				fib2=nextNo;
				System.out.print(nextNo+" ");
			}

	}

}
