import java.util.Scanner;

public class ReplaceSpaceWith99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String copy="";
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				copy=copy+"99";
				continue;
			}
			copy=copy+str.charAt(i);
		}
		*/
		copy=str.replace(" ","99");
		System.out.println(copy);
		
	}

}
