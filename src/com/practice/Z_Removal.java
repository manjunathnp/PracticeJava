package com.practice;

public class Z_Removal
{

	public static void main(String[] args) 
	{
		String str = "!@#123asdf$%Q#$ff";
		System.out.println(str);
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String str2 = "   White space  more while spaces    ...    ";
		System.out.println(str2.replaceAll("\\s", ""));
		
		System.out.println(str2.trim().replaceAll(" +", " "));
	}

}
