import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String copy="";
		for(int i=0;i<str.length();i++) {
			String ch=""+str.charAt(i);//String.valueOf(str.charAt(i))
			if(!copy.contains(ch)) {
				copy=copy+ch;
			}
		}
		System.out.print("String after removing duplicates: ");
		System.out.println(copy);
	}
}
