package com.kodnest2;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double p = scanner.nextDouble(),
				r=scanner.nextDouble(),
				t=scanner.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		double res=calculator.calculateSimpleInterest(p,r,t);
		System.out.println(res);
	}

}
