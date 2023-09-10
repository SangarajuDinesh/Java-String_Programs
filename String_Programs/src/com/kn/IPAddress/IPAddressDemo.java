package com.kn.IPAddress;

public class IPAddressDemo {

	public boolean iPAddress(String inputString) 
	{
		String srr[]=inputString.split(".");
		boolean isValid=false;
		if(srr.length==4)
		{
			for(int i=0;i<srr.length;i++)
			{
				char crr[]=srr[i].toCharArray();
				int num=0;
				for(int j=crr.length-1;j>=0;j--)
				{
					num=(num*10)+crr[j];
				}
				if(num>=0 && num<256)
				{
					isValid=true;
				}
				else
				{
					isValid=false;
				}
			}
		}
		else
		{
			isValid=false;
		}
		return isValid;
	}

}
