package com.bridgelabz.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to flip the coin");
		int n= input.nextInt();
		double[] result=new double[n];
		int head=0,tail=0;
		if (n > 0){
			for (int i=0 ;i< n; i++) {
				result[i]=Math.random();
				if (result[i]<0.5) {
					System.out.println("tail");
					tail++;				}
				else
					System.out.println("head");
					head++;
				}
			}
		float tail_percent=(tail*100)/n ;
		System.out.println("percentage of tail :" +tail_percent);
		float head_percent=(head*100)/n;
		System.out.println("percentage of head :" +head_percent);
		}
	}


