package com.kodnest;

import java.util.Scanner;

public class SurfAreaOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		PlanetExplorer pe = new PlanetExplorer();
		double r=sc.nextDouble();
		
		double res=pe.calculateSurfaceArea(r);
		System.out.println(res);
	}
 
}
