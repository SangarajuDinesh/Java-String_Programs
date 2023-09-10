package com.kn.BasicPrograms;

public class VariousMethodsOfStrings 
{
	public static void main(String[] args) 
	{
		String s1=" Dinesh:kumar:Raju ";
		System.out.println(s1.length());
		System.out.println(s1.startsWith("Dinesh"));
		System.out.println(s1.endsWith("Raju"));
		System.out.println(s1.replace('k','K'));
		System.out.println(s1.trim());
		System.out.println(s1.toCharArray());
		System.out.println(s1.replaceAll("Dinesh","DINESH"));
	}
}
