package com.kn.BasicPrograms;

public class CompareToMethod
{
	public static void main(String[] args) 
	{
		String s1="Ram";
		String s2="Shyam";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		if(s2.compareTo(s1)>0)
		{
			System.out.println("s2 is greater");
		}
		else if(s2.compareTo(s1)<0)
		{
			System.out.println("s2 is smaller");
		}
		else
		{
			System.out.println("same");
		}
		
	}
}
