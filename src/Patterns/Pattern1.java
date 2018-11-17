package Patterns;

public class Pattern1 {

	public static void main(String[] args) 
	{
		int star=0;
		int space =5;
		
		for(int i=5; i>0; i--)
		{
			
			for(int j=0; j<=space ;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++)
			{
				System.out.print(k+ " ");
			}
			star++;
			space--;
			System.out.println();
			
		}

	}

}
