
public class StringSplit {
	public static void main(String[] args) {
		String st="He is a very very good boy, isn't he?";
		String de= "[!,'@_. ]+";
		String[] d = null;
		if(st.trim().isEmpty()) {
			System.out.println(0);
		}else {
			d=st.trim().split(de);
		}
		for(String i:d)
			System.out.println(i);
	}
}