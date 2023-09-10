package com.kn.SmallestWordInString;

import java.util.Scanner;

public class SmallestWordInStringDemo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String inpuString=sc.nextLine();
		SmallestWordInString sw=new SmallestWordInString();
		System.out.println(sw.smallestWordInString(inpuString));
		sc.close();
	}
}
