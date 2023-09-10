package com.kn.FrequencyOfVowelsConsonantsDigits;

import java.util.Scanner;

public class FrequencyOfEachVowelAndConsonantAnsDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String = ");
		String inputString=sc.nextLine();
		FrequencyOfEachVowelAndConsonantAnsDigitDemo fc=new FrequencyOfEachVowelAndConsonantAnsDigitDemo();
		fc.frequencyOfEachVowelAndConsonantAnsDigit(inputString);
		sc.close();
	}
}
