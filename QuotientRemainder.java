package com.bridgelabz.day5;
 import java.util.*;
 
 
public class QuotientRemainder {
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);
		System.out.println("Enter number to find Quotient and Remainder");
		int dividend=input.nextInt();
		System.out.println("Enter divisor");
		int divisor=input.nextInt();
		 int  quotient= dividend / divisor;
		 int  remainder= dividend % divisor;
		input.close();
		 System.out.println("Quotient is" +quotient);
		 System.out.println("Remainder is" +remainder);
		}

}
