package com.kn.InvalidOrValidString;

import java.util.Scanner;

public class InvalidOrValidString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String userName=sc.nextLine();
		UserNameValidator un=new UserNameValidator();
		System.out.println(un.userNameValidator(userName));
		sc.close();
	}
}
