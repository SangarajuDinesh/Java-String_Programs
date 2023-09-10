package com.kn.NumberToRoman;

import java.util.Scanner;

public class NumberToRoman 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int num=sc.nextInt();
		String srr[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int arr[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		StringBuffer output=new StringBuffer();
		if(srr.length==arr.length)
		{
			for(int i=0;i<arr.length;i++)
			{
				while(num>=arr[i])
				{
					num=num-arr[i];
					output.append(srr[i]);
				}
			}
		}
		System.out.println(output);
		sc.close();
	}
}
