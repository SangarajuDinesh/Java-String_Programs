package com.kn.UpperAndLowerCase;

import java.util.Scanner;

public class UpperCaseToLowerCaseAndViceVersa 
{
	public static void main(String[] args) 
	{
		//take input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=sc.nextLine();	
		//Create an object
		UpperCaseToLowerCaseAndViceVersaDemo uc=new UpperCaseToLowerCaseAndViceVersaDemo();
		//call method
		String res=uc.upperCaseToLowerCaseAndViceVersa(inputString);
		//print result
		System.out.print(res);
		//release resources
		sc.close();
	}
}
