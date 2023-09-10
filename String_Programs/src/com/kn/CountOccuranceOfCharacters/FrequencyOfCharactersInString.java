package com.kn.CountOccuranceOfCharacters;

import java.util.Scanner;

public class FrequencyOfCharactersInString 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String inputString=sc.nextLine();
		FrequencyOfCharactersInStringDemo fc=new FrequencyOfCharactersInStringDemo();
		fc.frequencyOfCharactersInString(inputString);
		sc.close();
	}
}
