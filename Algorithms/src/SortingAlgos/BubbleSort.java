package SortingAlgos;
//bubble sort is nothing but sorting an array from last index
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {20,60,40,10,30,50};
		//logic for bubble sort
		//go until one iteration less than array length
		for(int i=0;i<arr.length-1;i++) 
		{
			//go until 1 less than last sorted index
			for(int j=1;j<arr.length-i;j++) 
			{
				//if higher index value is less than lower index value then swap
				if(arr[j]<arr[j-1]) 
				{
					//swap array values
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		//print array
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
//Output : 10 20 30 40 50 60 
