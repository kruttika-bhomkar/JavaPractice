package SearchingAlgos;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		int key=0;
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				System.out.println("key found at index "+mid);
				return;
			}
			if(key>arr[mid]) {
				low=mid+1;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
		}
		System.out.println("key not found");
	}

}
