package ArrayOperations;

import java.util.Scanner;

public class Creating2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Creation of 1D, 2D and 3D Arrays
		int arr[]=new int[5];
		System.out.println(arr.length);//5
		int arr1[][]=new int[5][5];
		System.out.println(arr1[0].length);//5
		int arr2[][][]=new int[2][2][2];//2
		System.out.println(arr2[0][0].length);
		
		//taking input to marks of each class students in 2D array
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.printf("enter marks of class %d student %d ",i,j);
				arr1[i][j]=sc.nextInt();
			}
		}
		//printing the 2D array of students' marks
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Marks of class "+i);
			for(int j=0;j<arr1[i].length;j++) {
				System.out.printf("Marks of student %d is %d",j,arr1[i][j]);
				System.out.println();
			}
		}
	}

}
