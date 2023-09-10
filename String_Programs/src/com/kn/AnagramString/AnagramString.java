package com.kn.AnagramString;

import java.util.Scanner;

public class AnagramString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String1 : ");
		String inputString1=sc.nextLine();
		System.out.print("Enter the String2 : ");
		String inputString2=sc.nextLine();
		AnagramStringDemo as=new AnagramStringDemo();
		as.anagramString(inputString1,inputString2);
		sc.close();
	}
}
