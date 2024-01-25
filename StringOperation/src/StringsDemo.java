import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("Rama");
		s=s.reverse();//amaR
		//System.out.println(s);
	//=================================================
		System.out.println("enter character array size");
		char[] ch= new char[sc.nextInt()];
		//char[] ch1= {'a','b','c'};
		System.out.println("enter array contents");
		for(int i=0;i<ch.length;i++)
			ch[i]=sc.next().charAt(0);
		System.out.println("array contents are: ");
		for(char i:ch)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("=========================================");
		char ch2[]=new char[ch.length];
		for(int i=0;i<ch2.length;i++)
			ch2[i]=ch[i];
		System.out.println("array 2 contents are: ");
		for(char i:ch2)
			System.out.print(i+" ");
		System.out.println();
	//====================================================================
		int j=0;
		char ch3[]=new char[ch2.length];
		for(int i=ch2.length-1;i>=0;i--) {
			ch3[j]=ch2[i];
			j++;
		}
		System.out.println("array 3 contents are: ");
		for(char k:ch3) {
			System.out.print(k+" ");
		}
	}

}
