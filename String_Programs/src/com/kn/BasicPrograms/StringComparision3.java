package com.kn.BasicPrograms;

public class StringComparision3 
{
	public static void main(String[] args) 
	{
		//Eg:1
		String s1="Ram";
		String s2="sita";
		//Reference Comparision
		if(s1==s2)
		{
			System.out.println("Same References");
		}
		else
		{
			System.out.println("Different References");
		}
		//Data comparision
		if(s1.equals(s2))
		{
			System.out.println("same data");
		}
		else
		{
			System.out.println("Different data");
		}
		System.out.println();
		//*********************************************
		//Eg:2
		String s3="Ram";
		String s4="Ram";
		//References comparision
		if(s3==s4)
		{
			System.out.println("same References");
		}
		else
		{
			System.out.println("Diffrent References");
		}
		//Data comparision
		if(s3.equals(s4))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
		System.out.println();
		//*************************************
		//Eg:3
		String s5=s1;
		String s6=s2;//s2="Sita"
		if(s5==s6)
		{
			System.out.println("same references");
		}
		else
		{
			System.out.println("Different references");
		}
		if(s5.equals(s6))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
		System.out.println();
		//********************************************
		//Eg:4
		String s7="ram";
		String s8=s7;
		if(s7==s8)
		{
			System.out.println("Same References");
		}
		else
		{
			System.out.println("Different References");
		}
		if(s7.equals(s8))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		System.out.println();
		//*********************************************
		//Eg:5
		String s9="ram"+"sita";
		String s10="ram"+s2;
		if(s9==s10)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
		if(s9.equals(s10)) 
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
		System.out.println();
		String s11=s1.concat(s2);
		String s12="Ram"+"Sita";
		if(s11==s12)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
		if(s3.equals(s4))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Different");
		}
	}
}
