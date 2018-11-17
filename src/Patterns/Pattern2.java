package Patterns;

public class Pattern2 {

	public static void main(String[] args) 
	{
		int star=5;
		int space =1;
		
		for(int i=5; i>0; i--)
		{
			
			for(int k=1; k<=space*2 ;k++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++)
			{
				System.out.print(k+ " ");
			}
			
			for(int k=1; k<=star; k++)
			{
				System.out.print(k+ " ");
				
			}
			System.out.println();
			star--;
			space++;
			
			
		}


	}

}
