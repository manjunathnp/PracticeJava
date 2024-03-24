package com.practice;

public class W_Words_Reversal 
{

	public static void main(String[] args) 
	{
		String str = "Practice makes Perfect!";
		
		String[] words = str.split("\\s");
				
		String revString = "";
		for(String word: words)
		{
			String revWord = "";
			for(int i=word.length()-1; i>=0; i--)
			{
				revWord = revWord + word.charAt(i);
			}
			revString = revString + revWord+ " ";

			/*StringBuilder sbl = new StringBuilder(word);
			//System.out.println(sbl.reverse());
			revString = revString +sbl.reverse()+ " ";*/
			
		}
		System.out.println(revString);
	}

}
