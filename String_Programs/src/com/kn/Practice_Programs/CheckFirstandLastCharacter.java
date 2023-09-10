package com.kn.Practice_Programs;

import java.util.Scanner;

public class CheckFirstandLastCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		char arr[]=inputString.toCharArray();
		if(arr[0]==arr[arr.length-1])
		{
			System.out.println(arr[0]+" & "+arr[arr.length-1]+" are Equal");
		}
		else
		{
			System.out.println(arr[0]+" & "+arr[arr.length-1]+" are Not Equal");
		}
		sc.close();
		
	}
}
