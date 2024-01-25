import java.util.*;
public class PalindromeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String str=s.next();
		Palindrome p=new Palindrome();
		boolean res=p.checkPal(str);
		if(res==true)
			System.out.println("string \""+str+"\" is a palindrome");
		else
			System.out.println("string "+str+" is not a palindrome");
	}

}
