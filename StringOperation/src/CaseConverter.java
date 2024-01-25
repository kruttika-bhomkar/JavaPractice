import java.util.Scanner;

public class CaseConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int upCount=0;
		int lowCount=0;
		String s=sc.nextLine();
		System.out.println("String before conversion: "+s);
		char c[]=s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])) {
				if(Character.isUpperCase(c[i])) {
					upCount++;
					c[i]=Character.toLowerCase(c[i]);
				}
				else {
					lowCount++;
					c[i]=Character.toUpperCase(c[i]);
				}
			}
		}
		String strCopy="";
		for(char i:c) {
			strCopy+=i;
		}
		System.out.println("Uppercase letters count: "+upCount);
		System.out.println("Lowercase letters count: "+lowCount);
		System.out.println("String after conversion: "+strCopy);
		
		
	}

}
