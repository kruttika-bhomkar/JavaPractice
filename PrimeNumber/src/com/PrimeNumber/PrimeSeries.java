package com.PrimeNumber;

import java.util.Scanner;

public class PrimeSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range for prime series");
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			int res=isPrime(i);
			if(res==i)
				System.out.println(i);
		}
	}

	public static int isPrime (int n) {
			for(int i=2;i<n;i++) {
				if(n%i==0)
					return 0;
			}
		return n;
	}
}
