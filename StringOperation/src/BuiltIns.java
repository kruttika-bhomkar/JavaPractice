
public class BuiltIns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Rama");
		String str1=str.intern();
		//str.intern() brings a copy of str from heap to string pool 
		//i.e, str1="Rama" will be created in string pool
		
		String str2="Rama";
		//String str2=new String("Rama");
		if(str1==str2)
			System.out.println("references are equal");
		else
			System.out.println("not equal");
	//===========================================================
		String str3=new String("hello java");
		char[] ch=str3.toCharArray();
		for(char i:ch)
		System.out.print(i+" ");
	//===========================================================
		String ref="Hello java classs is going on";
		//System.out.println(ref.replace('a', 'o'));
		//Hello jovo closss is going on
	//===========================================================
		String ref1=new String("my name is kruttika");
		ref1=ref1.replaceAll("my name is", "I am");
		//System.out.println(ref1);//I am kruttika
	//===========================================================
	}

}
