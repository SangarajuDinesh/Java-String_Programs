package com.kn.Assesment;

import java.util.Scanner;

public class DuplicateCharacterRemoval 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		char crr[]=input.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			for(int j=i+1;j<crr.length;j++)
			{
				if(crr[i]==crr[j])
				{
					crr[j]=' ';
				}
			}
		}
		String out=new String(crr);
		String arr[]=out.split(" ");
		StringBuffer out1=new StringBuffer();
		for(int i=0;i<arr.length;i++)
		{
			out1.append(arr[i]);
		}
		String out2=out1.toString();
		System.out.println(out2);
		sc.close();
	}
}
