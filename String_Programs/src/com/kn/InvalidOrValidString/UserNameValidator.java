package com.kn.InvalidOrValidString;

public class UserNameValidator {

	public String userNameValidator(String userName) 
	{
		String out="dk";
		if(userName.length()>=8 && userName.length()<=30)
		{
			char crr[]=userName.toCharArray();
			for(int i=1;i<crr.length;i++)
			{
				if((crr[0]>=65 && crr[i]<=90)||(crr[0]>=97 && crr[0]<=122))
				{
					if((crr[i]>=65 && crr[i]<=90)||(crr[i]>=97 && crr[i]<=122)||crr[i]=='_'|| (crr[i]>=48 && crr[i]<=57))
					{
						out="Valid";
					}
					else
					{
						out="Invalid";
						break;
					}
				}
				else 
				{
					out="Invalid";
				}
			}
		}
		else
		{
			out="Invalid";
		}
return out;
	}
}

