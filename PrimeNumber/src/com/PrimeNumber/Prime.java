package com.PrimeNumber;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean res=Rem.getRem(s.nextInt());
		System.out.println(res);
	}

}
class Rem{
	public static boolean getRem(int N) {
			
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				return false;//not prime
			}
		}
		return true;//prime
		
	}
}
