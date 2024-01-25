package IntegerConversion;

public class BinaryToDecimal {
public static void findDecimal(int bin) {
	int i=0;
	int dec=0;
	int rem=0;
	while(bin>0) {
		
		rem=bin%10;
		if (rem==1) {
			dec=dec+(int)Math.pow(2, i);
		}
		i++;
		bin=bin/10;
	}
	System.out.println(dec);
	
}
}

