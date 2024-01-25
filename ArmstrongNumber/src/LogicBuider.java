
public class LogicBuider {
	public long ArmstrongFinder(int n) {
		int count=0;
		int num=n;
		while(num!=0) {
			num=num/10;
			count++;
		}
		long x=0;
		for(int i=0;i<count;i++) {
			num=n%10;
			x = x+ (long) Math.pow(num, count);
			n=n/10;
		}
		return x;
	}
}
