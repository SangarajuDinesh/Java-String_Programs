package com.kn.CeaserCipher;

import java.util.Scanner;

public class CeaserCipher 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String = ");
		String inputString=sc.nextLine();
		System.out.print("Enter the No_Of_Steps = ");
		int num_Of_Steps=sc.nextInt();
		CeaserCipherDemo cc=new CeaserCipherDemo();
		System.out.print("Encrypted Password = "+cc.ceaserCipher(inputString,num_Of_Steps));
		sc.close();
	}
}
