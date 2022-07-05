package com.bridgelabz.day5;

import java.util.*;
public class VowelConsonant {
	public static void main(String[] args){
		char ch;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter  Alphabet");
		ch=input.next().charAt(0); 
		if (ch == 'a' || ch == 'A' || ch =='e' || ch == 'E' || ch =='i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u'|| ch == 'U'){
		System.out.println("Character is vowel");
		}
		else {
			System.out.println("Character is Consonant");
		}
			
		}
	}


