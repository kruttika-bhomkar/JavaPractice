package ArrayOperations;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arr[]= new int[sc.nextInt()];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number of indexes to be reversed left: ");
		int d=sc.nextInt();
		while(d>0) {
			int first=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
			}
			arr[arr.length-1]=first;
			d--;
		}
		System.out.println("Array after reversing: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
