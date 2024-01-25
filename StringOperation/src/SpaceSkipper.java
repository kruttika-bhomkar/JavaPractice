import java.util.Scanner;

public class SpaceSkipper {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        char[] copy=new char[ch.length];
        //copy spaces in new array
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                copy[i]=' ';
            }
        }
        //reverse the string
        int j=copy.length-1;
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]!=' ') {
        		if(copy[j]==' ') {
        			j--;
        		}
        		copy[j]=ch[i];
        		j--;
        	}
        }
        //print new char array
        System.out.println(copy);
    }
}
