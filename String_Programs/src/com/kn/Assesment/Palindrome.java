package com.kn.Assesment;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char crr[]=input.toCharArray();
		StringBuffer out=new StringBuffer();
		for(int i=crr.length-1;i>=0;i--)
		{
			out.append(crr[i]);
		}
		String out1=out.toString();
		if(input.equals(out1))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a paalindrome");
		}
		sc.close();
	}
}
