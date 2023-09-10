package com.kn.ReverseAStringWithSpacePosition;

public class ReverseStringWithSpacePositionDemo {

	public String reverseStringWithSpacePosition(String inputString) //i am dinesh
	{
		String srr[]=inputString.split(" ");//{"i","am","dinesh"}
		StringBuffer sb=new StringBuffer();
		for(int i=srr.length-1;i>=0;i--)
		{
			char crr[]=srr[i].toCharArray();//{{'i'},{'a','m'},{'d','i','n','e','s','h'}}
			for(int j=crr.length-1;j>=0;j--)
			{
				sb.append(crr[j]);
			}
			sb.append(" ");
		}
		String res=sb.toString();
		res.trim();
		return res;
	}

}
