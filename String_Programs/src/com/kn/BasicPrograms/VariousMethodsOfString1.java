package com.kn.BasicPrograms;

public class VariousMethodsOfString1 
{
	public static void main(String[] args) 
	{
		
		String s1="Sangaraju Dinesh Kumar Raju";
		String s2="Dinesh Raju";
		//Instance methods/Behaviors inside String class
		System.out.println("Upper case");
		System.out.println(s1.toUpperCase());//returns String
		System.out.println("********************");
		System.out.println("Lower case");
		System.out.println(s1.toLowerCase());//returns String
		System.out.println("********************");
		System.out.println("Character at a Specified Index");
		System.out.println(s1.charAt(10));//return character
		System.out.println("********************");
		System.out.println("Index of character at first occurance");
		System.out.println(s1.indexOf('S'));//returns integer
		System.out.println("********************");
		System.out.println("Index of character at last occurance");
		System.out.println(s1.lastIndexOf('a'));//returns integer
		System.out.println("********************");
		System.out.println("SubString of given String with begin index only");
		System.out.println(s1.substring(10));//returns string
		System.out.println("********************");
		System.out.println("SubString of given String with begin & End index only");
		System.out.println(s1.substring(10,23));//returns string 
		System.out.println("********************");
		System.out.println("Check for char Occurances");
		System.out.println(s1.contains("raju"));//return boolean
		System.out.println("********************");
		System.out.println(s1.length());
		System.out.println("********************");
		System.out.println(s1.startsWith("Sangaraju"));
		System.out.println("********************");
		System.out.println(s1.endsWith("Raju"));
		System.out.println("********************");
		System.out.println(s1.replace('a', 'A'));
		System.out.println("*******************");
		System.out.println(s1.replaceAll(s1, s2));
		
	}
}
