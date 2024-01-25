
public class CountOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RAMARAMASRI";
		int count=0;
		String copy="";
		for(int i=0;i<str.length();i++) {
			String ch=String.valueOf(str.charAt(i));
			if(!copy.contains(ch)) {
				copy=copy+ch;
			}
		}
		for(int i=0;i<copy.length();i++) {
			count=0;
			for(int j=0;j<str.length();j++) {
				if(copy.charAt(i)==str.charAt(j))
					count++;
			}
			System.out.println(copy.charAt(i)+"==>"+count);
		}
	}

}
