package com.kn.BasicPrograms;

import java.util.Scanner;

public class ReversingString 
{
	public static void main(String[] args) 
	{
		//Take an input String from user
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		//convert it into char. array
		char arr[]=s1.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(int i=arr.length-1;i>=0;i--)
		{
			sb.append(arr[i]);
		}
		String outpuString=sb.toString();
		System.out.println(outpuString);
		sc.close();
		
		
	}
}
