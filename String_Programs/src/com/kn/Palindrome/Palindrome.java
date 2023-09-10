package com.kn.Palindrome;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		//Read the String from the User
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check for palindrome = ");
		String inputString=sc.nextLine();
		//Create an object 
		PalindromeDemo palindrome=new PalindromeDemo();
		//call the method with reference variable
		palindrome.palindrome(inputString);
		//close the Scanner
		sc.close();
	}
}
