package com.grade;

import java.util.Scanner;

public class FindGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter grade");
		Main.check(sc.nextInt());
		

	}
}
class Main{
	public static void check(int grade) {
		if(grade>50) 
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}
