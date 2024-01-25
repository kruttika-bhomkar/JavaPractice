
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str =sc.nextLine();
		String copy=sc.nextLine();
		str=str.toLowerCase();
		copy=copy.toLowerCase();
		if(str.length()==copy.length()) {
			int count=0;
			int i=0;
			char[] ch=str.toCharArray();
			
			char[] copych=copy.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(copych);
			str=new String(ch);
			copy=new String(copych);
			if(str.equals(copy)) {
				System.out.println("Both strings are Anagram");;
			}
			else {
				System.out.println("Strings are not anagram");
			}
		}
	}

}
