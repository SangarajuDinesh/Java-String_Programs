package com.kn.ReversingTheWordsOfAString;

import java.util.Scanner;

public class ReversingTheCharactersOfWordInaGivenString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String s1=sc.nextLine();
		String srr[]=s1.split(" ");
		for(int i=0;i<srr.length;i++)
		{
			ReversingTheCharactersOfWordInaGivenStringDemo d1=new ReversingTheCharactersOfWordInaGivenStringDemo();
			d1.reversingCharactersOfWordsInAString(srr[i]);
		}
		sc.close();
		
	}
}
