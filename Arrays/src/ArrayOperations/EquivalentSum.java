package ArrayOperations;

public class EquivalentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,3,7,8};
		int target =4;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<=target) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<=target) {
						if((arr[i]+arr[j])==target) {
							System.out.println(i+"-"+j);
						}
					}
				}
			}
		}
	}

}
