package Reverse_String;

public class Reverse_String1 
{

	public static void main(String[] args) 
	{
	
		String s1=" Girish";
		String[] s2=s1.split(" ");
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i] + " ");
		}

	}

}
