package com.kodnest1;

import java.util.Scanner;

public class SportsTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HeightConverter converter = new HeightConverter();
		double inches=scanner.nextDouble();
		
		System.out.println(converter.convertInchesToFeet(inches));
	}

}
