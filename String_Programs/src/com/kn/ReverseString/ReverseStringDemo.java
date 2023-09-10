package com.kn.ReverseString;

public class ReverseStringDemo {
	//Method to reverse a String
	public String reverseString(String inputString) 
	{
		//Convert the String to Char Array
		char arr[]=inputString.toCharArray();
		//Create a StringBuffer/StringBuilder Object
		StringBuffer reverseString=new StringBuffer();
		//Back traverse the char array
		for(int i=inputString.length()-1;i>=0;i--)
		{
			reverseString=reverseString.append(arr[i]);
		}
		//Convert StringBuilder object to String
		return reverseString.toString();
	}

}
