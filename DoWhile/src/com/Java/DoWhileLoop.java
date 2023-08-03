package com.Java;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int pgno=100;
		int i=1;
		boolean b=false;
		do {
			System.out.println("packman read "+i+" pages.");
			System.out.println("Are you bored? :");
			b=scanner.nextBoolean();
			i++;
		}while(i<=pgno && b!=true);
		
		System.out.println("program ended. read "+(i-1)+" pages");
	}

}
