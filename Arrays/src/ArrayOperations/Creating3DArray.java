package ArrayOperations;

import java.util.Scanner;

public class Creating3DArray {

	public static void main(String[] args) {
		Scanner r= new Scanner(System.in);
		int arr[][][]=new int[2][3][4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Marks of school "+i+" class "+j+" student "+k);
					arr[i][j][k]=r.nextInt();
					System.out.println();
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
