package com.kn.ReverseString;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		//Read the String from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse = ");
		String inputString=sc.nextLine();
		// Create an object
		ReverseStringDemo reverse=new ReverseStringDemo();
		//call the method
		String outputString=reverse.reverseString(inputString);
		//Print the Output string
		System.out.println(outputString);
		//close the Scanner or release resorces
		sc.close();
	}
}
