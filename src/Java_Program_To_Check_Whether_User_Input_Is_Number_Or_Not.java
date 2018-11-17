import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_Program_To_Check_Whether_User_Input_Is_Number_Or_Not
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the Input : ");
		try
		{
		String n = sc.nextLine();
		
			if( Integer.parseInt(n)==Integer.valueOf(n))
			{
				System.out.println(n + "is an Integer");
			}
			
			
		}
		
		catch(Exception E)
		{
			System.out.println("Not a Number");
		}
		
		
	}

}
