
public class Palindrome {

	public boolean checkPal(String str) {
		// TODO Auto-generated method stub
		char[] ch=str.toCharArray();
		char ch1[]=new char[ch.length];
		String str2="";
		int j=ch.length-1;
		for(int i=0;i<ch1.length;i++) {
			ch1[i]=ch[j];
			j--;
		}
		for(int i=0;i<ch1.length;i++) {
			str2=str2+ch1[i];
		}
		//System.out.println(str2);
		if(str.equalsIgnoreCase(str2))
			return true;
		else
			return false;
	}

}
