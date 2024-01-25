import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3=s1.concat(s2);
		System.out.println("Strings after concatenation: "+s3);
	}

}
