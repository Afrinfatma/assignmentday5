package com.bridgelabz.day5;
import java .util.Scanner;

public class LeapYear {
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter year to check");
		double year= input.nextDouble();		
		year= Math.floor (1000+ Math.random()*9000);
		if ((year%400==0)||(year%4==0 && year%100!=0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
