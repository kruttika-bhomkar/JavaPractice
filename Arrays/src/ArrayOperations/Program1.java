package ArrayOperations;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int []arr=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents Are,....");
		//Traditional 'for' loop
		// for(int i=0;i<=arr.length-1;i++)
		// {
		// System.out.print(arr[i]+" ");
		// }
		for( int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
