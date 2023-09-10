package com.kn.UpperAndLowerCase;

public class UpperCaseToLowerCaseAndViceVersaDemo {

	public String upperCaseToLowerCaseAndViceVersa(String inputString) 
	{
		String srr[]=inputString.split(" ");//converting to String array
		StringBuffer sb=new StringBuffer();
		for(String s:srr)
		{
			char crr[]=s.toCharArray();//Converting to character array 
			for(int i=0;i<crr.length;i++)
			{
				if(crr[i]>=97 && crr[i]<=122)
				{
					crr[i]=(char)(crr[i]-32);
				}
				else
				{
					crr[i]=(char)(crr[i]+32);
				}
			}//appending to StringBuffer
			for(int i=0;i<crr.length;i++)
			{
				sb.append(crr[i]);
			}
			sb.append(" ");
		}//converting to String object
		String result=sb.toString();
		result.trim();
		return result;
	}

}
