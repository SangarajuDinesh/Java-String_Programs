package com.kn.Practice_Programs;

import java.util.Scanner;

public class ReversingCharactersOfWordsInString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		String srr[]=inputString.split(" ");
		for(int i=0;i<srr.length;i++)
		{
			reverse(srr[i]);
		}
		
		sc.close();
		
	}

	public static void reverse(String string) 
	{
		char []crr=string.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}
}
