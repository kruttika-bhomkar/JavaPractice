import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
        String s=sc.nextLine();
        
        String arr[]=s.split(" ");
        
        System.out.println("String after split: ");
        for(String i:arr) {
        	System.out.println(i);
        }
        
        String copy[]=new String[arr.length];
        String var="";
        for(int i=0;i<arr.length;i++) {
        	var="";
        	for(int j=arr[i].length()-1;j>=0;j--) {
        		var=var+arr[i].charAt(j);
        	}
        	copy[i]=var;
        }
       String newStr="";
        for(int k=0;k<copy.length;k++) {
        	newStr=newStr+copy[k]+ " ";
        }
        System.out.println("New string after reversing words: ");
        System.out.println(newStr);
	}

}
