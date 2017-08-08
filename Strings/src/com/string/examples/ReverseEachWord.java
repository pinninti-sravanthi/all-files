package com.string.examples;

public class ReverseEachWord {
public static void main(String[] args) {
	System.out.println(Reverse.CapitalizeWord("this is sravanthi"));
}
}
class Reverse {

	public static String CapitalizeWord(String str) {
		String str1[]=str.split("\\s");
		String Capitalizeword="";
		for(String w:str1)
		{
			String first=w.substring(0, 1);
			String afterfirst=w.substring(1);
			Capitalizeword+=first.toUpperCase()+afterfirst+" ";
			
		}
				
		return Capitalizeword.trim();
	}

}
