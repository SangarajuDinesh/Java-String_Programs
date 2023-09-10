package com.kn.SmallestWordInString;

public class SmallestWordInString {

	public String smallestWordInString(String inpuString) 
	{
		String[] srr=inpuString.split(" ");
		String smallest=srr[0];
		for(int i=1;i<srr.length;i++)
		{
			if(srr[i].length()<smallest.length())
			{
				smallest=srr[i];
			}
		}
		return smallest;
	}

}
