package com.kn.Assesment;

import java.util.Scanner;

public class SwappingtheWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		String input3=sc.nextLine();
		String temp=input1;
		input1=input2;
		input2=temp;
		System.out.println(input1+":"+input2+":"+input3);
		sc.close();
	}
}
