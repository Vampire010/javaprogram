package Programs_On_Numbers;

import java.util.Scanner;

public class Checking_if_the_number_is_even_or_odd_without_using_the_Moduls_operator 
{

	static int num;
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println(" Enter the Input : ");
		
		int n = sc.nextInt();	
		
		if(((num/2)*2)==num)
			{
				System.out.println(" Enterd Number is Even" + n );
			}
			else
			{
				System.out.println(" Enterd Number is Odd" + n );
			}
		}

}
