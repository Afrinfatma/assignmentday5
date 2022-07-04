package com.bridgelabz.day5;
import java.util.*;

public class Swap {
    public static void main(String[] args){
    	Scanner input =new Scanner(System.in);
    	System.out.println("Enter  1st  no.");
    	int a=input.nextInt();
    	System.out.println("Enter  2nd  no.");
    	int b=input.nextInt();
    	int t;
    	t=a;
    	a=b;
    	b=t;
    	input.close();
    	System.out.println("a=:" +a);
    	System.out.println("b=:" +b);
    }
}
