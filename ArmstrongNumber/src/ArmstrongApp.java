import java.util.Scanner;

public class ArmstrongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		LogicBuider l=new LogicBuider();
		long res = l.ArmstrongFinder(n);
		System.out.println("Result "+res);
		if(res==n) {
			System.out.println(n+" is an Armstrong Number");
		}
		else
			System.out.println(n+" is not an Armstrong Number");
	}

}
