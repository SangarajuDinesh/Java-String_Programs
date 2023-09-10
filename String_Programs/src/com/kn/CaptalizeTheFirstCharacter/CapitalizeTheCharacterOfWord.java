package com.kn.CaptalizeTheFirstCharacter;

import java.util.Scanner;

public class CapitalizeTheCharacterOfWord 
{
	public static void main(String[] args) 
	{
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=sc.nextLine();
		//create a object 
		CapitalizeTheCharacterOfWordDemo ct=new CapitalizeTheCharacterOfWordDemo();
		//call method
		String res=ct.capitalizeTheCharacterOfWord(inputString);
		//print result
		System.out.println(res);
		//release resources
		sc.close();
	}
}
