package com.kn.Practice_Programs;

public class NonRepeatedCharactersInaStringDemo 
{

	public void nonRepeatedCharactersInaString(String inputString) 
	{
		char[] arr=inputString.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<arr.length;i++) 
		{
			int count=1;
			char temp=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				if(temp!=arr[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			System.out.println(count);
		}
	}
	
}
