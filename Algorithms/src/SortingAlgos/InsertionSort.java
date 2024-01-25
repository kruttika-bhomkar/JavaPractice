package SortingAlgos;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,94,3,1,9,96,45,20,87,50};
		for(int i=1;i<arr.length;i++) 
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		for(int i:arr)
			System.out.print(i+" ");
	}

}
