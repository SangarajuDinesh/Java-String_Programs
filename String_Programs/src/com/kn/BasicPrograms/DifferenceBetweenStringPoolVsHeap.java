package com.kn.BasicPrograms;

public class DifferenceBetweenStringPoolVsHeap 
{
	public static void main(String[] args) 
	{
		String s1="Ram";
		System.out.println("s1 = "+s1);
		String s2=new String("Sita");
		System.out.println("s2 = "+s2);
		char[] crr=new char[5];
		crr[0]='S';
		crr[1]='H';
		crr[2]='Y';
		crr[3]='A';
		crr[4]='M';
		String s3=new String(crr);
		System.out.println("s3 = "+s3);
		
		String s4="Ram";//Before Creating an object in String pool it heecks for dupliactes
		System.out.println("s4 = "+s4);
		String s5=new String("Sita");//But it doesnt chacek for duplicates.
		System.out.println("s5 = "+s5);
	}
}
