package com.kn.CeaserCipher;

public class CeaserCipherDemo {

	public String ceaserCipher(String inputString, int num_Of_Steps) 
	{
		char arr[]=inputString.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				if((arr[i]+num_Of_Steps)<=90)
				{
					arr[i]=(char)(arr[i]+num_Of_Steps);
				}
				else if((arr[i]+num_Of_Steps)>90)
				{
					arr[i]=(char)(arr[i]-26+num_Of_Steps);
				}
			}
			else if(arr[i]>=97 && arr[i]<=122)
			{
				if((arr[i]+num_Of_Steps)<=122)
				{
					arr[i]=(char)(arr[i]+num_Of_Steps);
				}
				else if((arr[i]+num_Of_Steps)>122)
				{
					arr[i]=(char)(arr[i]-26+num_Of_Steps);
				}
			}
		}
		String res=new String(arr);
		return res;
		
	}

}
