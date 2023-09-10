
public class RemoveCharacterFromString 
{
	public static void main(String[] args) {
		String inputString="sangaraju";
		char arr[]=inputString.toCharArray();
		char ch='a';
		for(int i=0;i<arr.length;i++)
		{
			if(ch==arr[i])
			{
				arr[i]='d';
			}
		}
		String s=new String(arr);
		System.out.println(s);
	}
}
