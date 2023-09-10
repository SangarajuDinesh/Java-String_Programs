package com.kn.ReverseStringWithReservedSpace;

public class ReverseStringWithReservedSpaceDemo {

	public void reverseStringWithReservedSpace(String inputString) 
	{
		char arr[]=inputString.toCharArray();
		char srr[]=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				srr[i]=' ';
			}
		}
		int n=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=' ' && srr[n]!=' ')
			{
				srr[n]=arr[i];
			}
			else if(arr[i]!=' ' && srr[n]==' ')
			{
				n++;
				srr[n]=arr[i];
			}
			else if(arr[i]==' ' && srr[n]!=' ')
			{
				i--;
				srr[n]=arr[i];
			}
			n++;
			
		}
		for(char c: srr)
		{
			System.out.print(c);
		}
	}

}
