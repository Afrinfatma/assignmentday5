package com.bridgelabz.day5;

import java.util.Scanner;
public class Power {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		System.out.println("Power of 2^" +n+ "is :" +(Math.pow(2, n)));
		System.out.println();
		System.out.println("Print all till power value");
		
		for (int i=1; i<=n; i++) {
			System.out.println("Power of 2^" +i+ "is :" +(Math.pow(2, i)));	
		}
	}

}
