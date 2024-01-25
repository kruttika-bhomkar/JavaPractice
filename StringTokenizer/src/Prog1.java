import java.util.StringTokenizer;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello there,...!!!! I'm using 'Eclipse' IDE..";
		StringTokenizer st=new StringTokenizer(str," .,!'");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
