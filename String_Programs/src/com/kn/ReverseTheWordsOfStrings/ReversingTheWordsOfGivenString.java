package com.kn.ReverseTheWordsOfStrings;

import java.util.Scanner;

public class ReversingTheWordsOfGivenString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s1=sc.nextLine();//iam learning strings in java
		String srr[]=s1.split(" ");
		for(int i=srr.length-1;i>=0;i--)
		{
			System.out.print(srr[i]+" ");
		}
		sc.close();
		
	}
}
