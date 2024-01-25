package SortingAlgos;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,94,3,1,9,96,45,20,87,50};
		for(int i=0;i<arr.length-1;i++) {
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[pos]>arr[j]) {
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
