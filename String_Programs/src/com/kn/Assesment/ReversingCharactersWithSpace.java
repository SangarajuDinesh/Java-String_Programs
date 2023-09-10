package com.kn.Assesment;

import java.util.Scanner;

public class ReversingCharactersWithSpace 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char arr[]=input.toCharArray();
		char crr[]=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				crr[i]=' ';
			}
		}
		int n=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=' ' && crr[n]!=' ')
			{
				crr[n]=arr[i];
			}
			else if(arr[i]!=' ' && crr[n]==' ')
			{
				n++;
				crr[n]=arr[i];
			}
			else if(arr[i]==' ' && crr[n]!=' ')
			{
				i--;
				crr[n]=arr[i];
			}
			n++;
		}
		String output=new String(crr);
		System.out.println(output);
		sc.close();
	}
}
