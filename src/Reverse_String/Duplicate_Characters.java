package Reverse_String;

public class Duplicate_Characters {

	public static void main(String[] args) 
	{
		String s1= "abcddeefghhhkkkklllll";
		char[] s2= s1.toCharArray();
		int count=0;

		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if (s2[i]==s2[j])
				{
					System.out.print(s2[j]);
					count ++;
					break;
				}
					
			}
		}

	}

}
