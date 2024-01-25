package SearchingAlgos;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50,60};
		int key=50;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				System.out.println("key found at index "+i);
			}
		}
	}

}
