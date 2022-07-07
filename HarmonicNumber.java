package com.bridgelabz.day5;
import java.util.*;


public class HarmonicNumber {
	
	public static void main(String[] args){
		System.out.println("enter the number");
		Scanner input=new Scanner(System.in);
		int num = input.nextInt();
		double result=0.0;
		
		for(int i=1 ;i<num ;i++ ) {
			result+= (double)1/i; 
		System.out.print( result + " ,");
	}
	}

}
