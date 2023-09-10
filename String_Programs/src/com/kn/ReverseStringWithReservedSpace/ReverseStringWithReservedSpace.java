package com.kn.ReverseStringWithReservedSpace;

import java.util.Scanner;

public class ReverseStringWithReservedSpace 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String inputString=sc.nextLine();
		ReverseStringWithReservedSpaceDemo rs=new ReverseStringWithReservedSpaceDemo();
		rs.reverseStringWithReservedSpace(inputString);
		sc.close();
	}
}
