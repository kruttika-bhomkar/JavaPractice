
public class NumberReverse {
	public int revNumber(int n) {
		int num=0;
		int x=0;
		while(n!=0) {//1771,177
			num=n%10;//1,7
			x=x*10+num;//1
			
			n=n/10;//177
			
		}
		return x;
	}
}
