package com.kn.ReverseAStringWithSpacePosition;

import java.util.Scanner;

public class ReverseStringWithSpacePosition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=sc.nextLine();
		ReverseStringWithSpacePositionDemo rs=new ReverseStringWithSpacePositionDemo();
		String res=rs.reverseStringWithSpacePosition(inputString);
		System.out.print(res);
		sc.close();
		
		
	}
}
