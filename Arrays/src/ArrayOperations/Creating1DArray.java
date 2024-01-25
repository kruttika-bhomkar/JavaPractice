package ArrayOperations;

import java.util.Scanner;

public class Creating1DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		
		//taking input to 1D array
		System.out.println("Enter array elements");
		for(int i=0;i<=4;i++) {
			arr[i]=sc.nextInt();
		}
		
		//printing 1D array elements 
		System.out.print("Array elements are: ");
		for(int i:arr)
			System.out.print(i+" ");
	}

}
