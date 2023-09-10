package com.kn.BasicPrograms;

public class MutableString 
{
	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Dinesh");
		System.out.println(s1.length());
		System.out.println(s1.capacity());//length+default(16);
		s1.append("sita");
		s1.append("sita");//append is used to concatinate in Mutable String 
		s1.append("sita");
		s1.append("sita");
		s1.append("sita");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
	}
}
