package com.kn.CountOccurancesOsSubSTring;
import java.util.Scanner;
public class CountOccurancesOfSubString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String arr[]=input.split(" ");
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
