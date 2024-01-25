import java.util.Scanner;

public class StringLengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		if(s.length()==s1.length()) {
			System.out.println("Both strings are equal in length");
		}
		else {
			System.out.println("Both strings have unequal length");
		}
	}

}
