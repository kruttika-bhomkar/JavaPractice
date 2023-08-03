import java.util.Scanner;

public class ReverseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		NumberReverse nr=new NumberReverse();
		int res=nr.revNumber(n);
		System.out.println(res);
		if(n==res) {
			System.out.println("Number "+n+" is a Palindrome");
		}
		else
			System.out.println("Number "+n+" is not a Palindrome");
	}

}
