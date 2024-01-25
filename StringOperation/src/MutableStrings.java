
public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Sachin is a batsman");
		sb.append("Saurav is a batsman");
		System.out.println(sb.capacity());
		
		
		StringBuilder sbu=new StringBuilder ();
		//System.out.println(sbu);
		//sbu.append(" hello");
		//System.out.println(sbu);
	}

}
