package com.kn.BasicPrograms;

public class StringComparision1 
{
	public static void main(String[] args) 
	{
		String s1="Ram";
		String s2="Ram";
		//Reference Comparision
		if(s1==s2)
		{
			System.out.println("References are same");
		}
		else
		{
			System.out.println("references are different");
		}
		
		String s3=new String("Sita");
		String s4=new String("Sita");
		//Reference Comparision
		if(s3==s4)
		{
			System.out.print("References are same");
		}
		else
		{
			System.out.println("References are Different");
		}
	}
}
