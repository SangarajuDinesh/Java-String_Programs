package com.kn.Assesment;

import java.util.Scanner;

public class SubstringPrinting 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char arr[]=input.toCharArray();
		StringBuffer out=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				out.append(arr[j]);
			}
			out.append("\n");
		}
		System.out.println(out);
		sc.close();
	}
}
