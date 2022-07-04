package com.bridgelabz.day5;

import java.util.Scanner;

public class PrimeFactorization {
 public static void main(String[] args){
	 Scanner input =new Scanner(System.in);
	 System.out.println("Enter the number to find factor using prime factorization");
	 int n=input.nextInt();
	 for (int div=2;div<=n;div++) {
		 while(n%div==0) {
			 n=n/div;
			 System.out.print(div + " ");
		 }
	 }
	 if (n!=1) {
		 System.out.print(n);
	 }
 }
}
