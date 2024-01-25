package ArrayOperations;

import java.util.Scanner;

public class Split {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str="Hello World!";
	String rep="";
	char target=sc.next().charAt(0);
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==target) {
			for(int j=i+1;j<str.length();j++) {
				rep=rep+str.charAt(j);
			}
			System.out.println(rep);
			return;
		}
	}
	System.out.println(str);
}
}
