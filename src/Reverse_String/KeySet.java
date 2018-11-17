package Reverse_String;

public class KeySet {

	public static void main(String[] args) 
	{
		 int arr[] = { 2,7,-9,3,6,1,7,4,2 };	
		 boolean  arr2;
		for (int i=0; i<  arr.length-1 ; i++) 
        { 
            for (int j=0; j < i; j++) 
            {
            	if( arr2=(arr[i]) - (arr[j]) ==4 || (arr[i]) * (arr[j]) ==4)
            	{
            		System.out.println(arr2);
            		System.out.println(arr[i]);
            		System.out.println(arr[j]);
            		}
            	 
            }
            System.out.println(); 
        } 

	}

}
