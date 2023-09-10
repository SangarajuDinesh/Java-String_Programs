package com.kn.LongestWordInGivenString;

public class LongestWordInGivenStringDemo 
{

	public void longestWord(String s1) 
	{
		String arr[]=s1.split(" ");
		String long1 = arr[0];
		for(int i=1;i<arr.length;i++)
		{	
			if(arr[i].length()>long1.length())
			{
				long1=arr[i];
			}
		}
		System.out.println(long1);
		
		
		

	}
	
}
