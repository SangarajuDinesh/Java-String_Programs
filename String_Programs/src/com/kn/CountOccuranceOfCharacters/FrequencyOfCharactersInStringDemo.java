package com.kn.CountOccuranceOfCharacters;

public class FrequencyOfCharactersInStringDemo {
	public void frequencyOfCharactersInString(String inputString) 
	{
		char arr[]=inputString.toCharArray();
		arr=sortCharacterArray(arr);
		int count=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i]+" occurs in "+count+" times");
				count=1;
			}
			if(i+1==arr.length-1)
			{
				System.out.println(arr[i+1]+" occurs in "+count+" times");
			}
		}
	}

	public char[] sortCharacterArray(char[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}
