package com.kn.BasicPrograms;

public class StringComparision2 
{
	public static void main(String[] args) 
	{
		String s1="Ram";
		String s2="Ram";
		//String Value/literal/Data comparision
		if(s1.equals(s2))
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("String are Different");
		}
		
		String s3=new String("Sita");
		String s4=new String("Sita");
		if(s3.equals(s4))
		{
			System.out.println("Strings are same");
		}
		else 
		{
			System.out.println("Strings are Different");
		}
	}
}
