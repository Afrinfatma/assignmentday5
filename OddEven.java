package com.bridgelabz.day5;

import java .util.*;

public class OddEven {
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		if(n%2==0) {
			System.out.println(" Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
