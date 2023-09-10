package com.kn.Practice_Programs;

import java.util.Scanner;

public class LargestWordInGivenString 
{
	public static void main(String[] args) 
	{
		//Read the String from the user
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		String[] srr=inputString.split(" ");
		String longestWord=srr[0];
		for(int i=1;i<srr.length;i++)
		{
			if(longestWord.length()<srr[i].length())
			{
				longestWord=srr[i];
			}
		}
		System.out.println(longestWord);
		sc.close();
	}
}
