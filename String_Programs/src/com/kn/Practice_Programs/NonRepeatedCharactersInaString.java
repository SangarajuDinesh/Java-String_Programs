package com.kn.Practice_Programs;

import java.util.Scanner;

public class NonRepeatedCharactersInaString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String inputString=sc.nextLine();
		NonRepeatedCharactersInaStringDemo nrc=new NonRepeatedCharactersInaStringDemo();
		nrc.nonRepeatedCharactersInaString(inputString);
		sc.close();
		
	}
}
