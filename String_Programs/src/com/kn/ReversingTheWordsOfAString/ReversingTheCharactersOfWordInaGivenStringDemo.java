package com.kn.ReversingTheWordsOfAString;

public class ReversingTheCharactersOfWordInaGivenStringDemo 
{

	public void reversingCharactersOfWordsInAString(String s2) 
	{
		char crr[]=s2.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
			
		}
		System.out.print(" ");
		
	}

}
