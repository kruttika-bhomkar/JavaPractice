package ArrayOperations;

public class PrintArray {
	void printArray(int arr[])
	{
	System.out.println("Array Contents in forward direction");
	for (int x : arr) {
	System.out.print(x+" ");
	}
	System.out.println();
	System.out.println("================================");
	System.out.println("Array Contents in reverse direction");
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.print(arr[i]+" ");
	}
}
}
