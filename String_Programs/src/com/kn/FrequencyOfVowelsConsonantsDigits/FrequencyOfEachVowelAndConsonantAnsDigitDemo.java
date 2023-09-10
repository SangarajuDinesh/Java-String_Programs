package com.kn.FrequencyOfVowelsConsonantsDigits;

public class FrequencyOfEachVowelAndConsonantAnsDigitDemo {

	public void frequencyOfEachVowelAndConsonantAnsDigit(String inputString) 
	{
		char crr[]=inputString.toCharArray();
		countingUpper(crr);
		countingLower(crr);
		countDigits(crr);
		countSpace(crr);
		
	}	
	public static void countingUpper(char []crr)
	{
	int upperVowel=0;
	int upperConsonant=0;
	for(int i=0;i<crr.length;i++)
	{
		if(crr[i]>=65 && crr[i]<=90)
		{
			if(crr[i]=='A' || crr[i]=='E' || crr[i]=='I' || crr[i]=='O' || crr[i]=='U')
			{
				upperVowel++;
			}
			else
			{
				upperConsonant++;
			}
		}
	}
	System.out.println("Upper case vowels = "+upperVowel);
	System.out.println("Upper case Consonants = "+upperConsonant);
	}
	public static void countingLower(char []crr)
	{
	int lowerVowel=0;
	int lowerConsonant=0;
	for(int i=0;i<crr.length;i++)
	{
		if(crr[i]>=97 && crr[i]<=122)
		{
			if(crr[i]=='a' || crr[i]=='e' || crr[i]=='i' || crr[i]=='o' || crr[i]=='u')
			{
				lowerVowel++;
			}
			else
			{
				lowerConsonant++;
			}
		}
	}
	System.out.println("Lower case vowels = "+lowerVowel);
	System.out.println("Lower case Consonants = "+lowerConsonant);
	
	}
	public void countDigits(char[] crr)
	{
		int digitsCount=0;
		int specialCount=0;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]>=48 && crr[i]<=57)
			{
				if(crr[i]=='0' || crr[i]=='1' || crr[i]=='2' || crr[i]=='3' || crr[i]=='4' || crr[i]=='5' || crr[i]=='6' || crr[i]=='7' || crr[i]=='8' || crr[i]=='9')
				{
					digitsCount++;
				}
			}
			else if((crr[i]>=33 && crr[i]<48 )|| crr[i]>=58 && crr[i]<=64 || crr[i]>=91 && crr[i]<=96 || crr[i]>=123 && crr[i]<=126)
			{
				specialCount++;
			}
		}
		System.out.println("Digits count = "+digitsCount);
		System.out.println("Sepecial characters count = "+specialCount);
	}
	public void countSpace(char crr[]) 
	{
		int countSpace=0;
		for(int i=0;i<crr.length;i++)
		{
			if(crr[i]==32)
			{
				countSpace++;
			}
		}
		System.out.println("Space count = "+countSpace);
		
	}
}
