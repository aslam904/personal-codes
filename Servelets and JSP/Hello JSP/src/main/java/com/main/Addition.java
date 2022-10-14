package com.main;

import java.util.Scanner;

public class Addition {
	Scanner sc=new Scanner(System.in);

	public int add() {
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		int c=a+b;
		return c;
	}
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
}
