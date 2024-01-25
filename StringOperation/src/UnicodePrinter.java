import java.util.Scanner;

public class UnicodePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			int c=s.charAt(i);
			System.out.println(c);
		}
	}

}
