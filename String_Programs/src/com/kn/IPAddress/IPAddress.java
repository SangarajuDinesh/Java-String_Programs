package com.kn.IPAddress;

import java.util.Scanner;

public class IPAddress 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		IPAddressDemo ip=new IPAddressDemo();
		boolean isValid=ip.iPAddress(inputString);
		if(isValid)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}
}
