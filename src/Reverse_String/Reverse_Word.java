package Reverse_String;
import java.lang.*; 
import java.io.*; 
import java.util.*;
public class Reverse_Word {

	public static void main(String[] args)
	{
	
			String s1="Hello Girish";
			char[] s2=s1.toCharArray();
			for(int i=s2.length-1;i>=0;i--)
			{
				System.out.print(s2[i]+" ");
			}

	}

}
