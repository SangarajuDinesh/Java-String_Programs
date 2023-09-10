package com.kn.Assesment;

import java.util.Scanner;

public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		if(input1.length()==input2.length())
		{
			char arr[]=input1.toCharArray();
			for(int i=0;i<arr.length;i++)
			{
				int num=arr[i];
				int index=i;
				for(int j=i+1;j<arr.length;j++)
				{
					if(num>arr[j])
					{
						num=arr[j];
						index=j;
					}
				}
				char temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
			String output1=new String(arr);
			char crr[]=input2.toCharArray();
			for(int i=0;i<crr.length;i++)
			{
				int num=crr[i];
				int index=i;
				for(int j=i+1;j<crr.length;j++)
				{
					if(num>crr[j])
					{
						num=crr[j];
						index=j;
					}
				}
				char temp=crr[i];
				crr[i]=crr[index];
				crr[index]=temp;
			}
			String output2=new String(crr);
			if(output1.equals(output2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
		else
		{
			System.out.println("Not an anagram");
		}
		sc.close();
	}
}
