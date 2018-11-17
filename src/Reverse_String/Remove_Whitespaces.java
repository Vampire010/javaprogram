package Reverse_String;

public class Remove_Whitespaces {

	public static void main(String[] args) 
	{
		String sentence = "G I R I S H.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);

	}

}
//;.