package com.kn.Palindrome;

public class PalindromeDemo {

	public void palindrome(String inputString) 
	{
		//convert String to char array
		char arr[]=inputString.toCharArray();
		//Create a String Builder
		StringBuffer palindrome=new StringBuffer();
		//Traverse an arruy in backward
		for(int i=inputString.length()-1;i>=0;i--)
		{
			palindrome=palindrome.append(arr[i]);
		}
		String palindrome1 = palindrome.toString();
		if(inputString.equals(palindrome1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
		

}
