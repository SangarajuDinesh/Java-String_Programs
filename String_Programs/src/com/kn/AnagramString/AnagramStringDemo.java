package com.kn.AnagramString;

public class AnagramStringDemo {

	public void anagramString(String inputString1, String inputString2) 
	{
		if(inputString1.length()==inputString2.length())
		{
			char arr1[]=inputString1.toCharArray();
			for(int i=0;i<arr1.length-1;i++)
			{
				for(int j=0;j<arr1.length-1-i;j++)
				{
					if(arr1[j]>arr1[j+1])
					{
						char temp1=arr1[j];
						arr1[j]=arr1[j+1];
						arr1[j+1]=temp1;
					}
				}
			}
			String outputString1=new String(arr1);
			System.out.println("Sorted String1 = "+outputString1);
			char arr2[]=inputString2.toCharArray();
			for(int i=0;i<arr2.length-1;i++)
			{
				for(int j=0;j<arr2.length-1-i;j++)
				{
					if(arr2[j]>arr2[j+1])
					{
						char temp2=arr2[j];
						arr2[j]=arr2[j+1];
						arr2[j+1]=temp2;
					}
				}
			}
			String outpString2=new String(arr2);
			System.out.println("Sorted String2 = "+outpString2);
			if(outputString1.equals(outpString2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
		else
		{
			System.out.println("Not an anagram");
		}
	}
}
