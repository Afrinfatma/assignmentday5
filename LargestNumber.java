package com.bridgelabz.day5;

import java.util.*;
public class LargestNumber {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1=input.nextInt();
		System.out.println("Enter Second Number");
		int num2=input.nextInt();
		System.out.println("Enter Third Number");
		int num3=input.nextInt();
		if( num1 > num2 && num1> num3) {
		  System.out.println("The largest of three number is:" +num1);
			}
		else if (num2 > num3) {
			System.out.println("The largest of three number is :" +num2);
		}
		else {
			System.out.println("The largest of three number is :" +num3);
		}
		}
	}


