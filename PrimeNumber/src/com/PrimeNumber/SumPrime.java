package com.PrimeNumber;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(primeNumber(arr[i])) {
				sum=sum+arr[i];
			}
			
		}
		System.out.println("Sum of Prime Numbers: "+sum);
		
	}
	public static boolean primeNumber(int a) {
		
		
			if(a==1 || a==0)
				return false;
			if(a==2) 
				return true;
			if(a%2==0)
				return false;
			for(int j=2;j<a;j++) {
				if(a%j==0 ) {
					return false;
				}
			}
		return true;
	}

}
