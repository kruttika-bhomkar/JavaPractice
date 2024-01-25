package com.Vegetable;
//import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		Vegetable v1=new Vegetable();
		v1.getVegetable(1, "tomato", "red");
		//v1.setColor("yellow");
		System.out.println(v1.id+" "+v1.name+" "+v1.getColor());
		v1.dish();
	}

}
