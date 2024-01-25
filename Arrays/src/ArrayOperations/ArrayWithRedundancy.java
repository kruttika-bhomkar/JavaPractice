package ArrayOperations;

import java.util.Scanner;

public class ArrayWithRedundancy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][]=new int[3][][];
		Scanner r=new Scanner(System.in);
		/*
		3 schools' no. of classes
		arr[0]=new int[3][];
		arr[1]=new int[2][];
		arr[2]=new int[4][];
		
		school 0 no. of students in 3 classes
		arr[0][0]=new int[3];
		arr[0][1]=new int[4];
		arr[0][2]=new int[2];
		
		school 1's no. of students in 2 classes
		arr[1][0]=new int[4];
		arr[1][1]=new int[3];
		
		school 2's no. of students in 4 classes
		arr[2][0]=new int[2];
		arr[2][1]=new int[3];
		arr[2][2]=new int[1];
		arr[2][3]=new int[2];
		*/
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter no. of classes for school "+i);
			arr[i]=new int[r.nextInt()][];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter no. of students for school "+i+" and class "+j);
				arr[i][j]=new int[r.nextInt()];
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Marks of school "+i+" class "+j+" student "+k);
					arr[i][j][k]=r.nextInt();
				}
			}
		}
		System.out.println("Array Contents are:  ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("--------------------");
		}
	}

}
