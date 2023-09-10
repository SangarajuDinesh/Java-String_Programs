package com.kn.LongestWordInGivenString;

import java.util.Scanner;

public class LongestWordInGivenString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String input=sc.nextLine();
		LongestWordInGivenStringDemo d1=new LongestWordInGivenStringDemo();
		d1.longestWord(input);
		sc.close();
	}
}
