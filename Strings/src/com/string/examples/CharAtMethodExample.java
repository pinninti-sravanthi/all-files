package com.string.examples;

public class CharAtMethodExample {
	public static void main(String[] args) throws StringIndexOutOfBoundsException {
		try {

			String str = "hello";// string literal
			String str1 = new String("hello");// string by new keyword
			System.out.println(str + " " + str1);
			System.out.println(str.compareTo(str1));// 0 because both are equal based on unicode values
			String str2 = "";
			System.out.println(str2.compareTo(str1));// -5
			System.out.println(str1.compareTo(str2));// 5
			str1 = str1.concat(" world");// concatenation
			System.out.println(str1);// hello world by concat method
			System.out.println(str1 = str1 + "!");// hello world! by + operator
			System.out.println(str1.contains("!"));// contains method return boolean value as true
			System.out.println(str1.endsWith("world!"));// ends with method return true if it is ending with
			System.out.println(str.endsWith("!"));
			String str3 = "hello world!";
			System.out.println(str3.equals(str1));// equals method return true based on content
			System.out.println(str3.equals(str));
			String str4 = new String("HELLO WORLD!");// equalsIgnoreCase same as equals but case is not considered
			System.out.println(str4.equalsIgnoreCase(str1));
			String str5 = String.format("string has %s", str);// string format
			String str6 = String.format("address is %d", 12455453);// string format
			System.out.println(str6);
			System.out.println(str5);
			byte arr[] = str.getBytes();// getbytes
			for (byte b : arr) {
				System.out.println(b);
			}
			char[] ch=new char[50];
			str.getChars(0, 3, ch, 0);
			System.out.println(ch);//hel
			System.out.println(str1.indexOf("!"));//11 indexof returns index of substring
			
			String obj=str1.intern();
			if(str1.equals(obj))
			{
				System.out.println("equal");
			}
		
			if(str.equals(obj))
			{
				System.out.println("equals");
			}
			else
			{
				System.out.println("not equals");
			}
			if(str2.isEmpty())
			{
				System.out.println("true");
			}
			if(str1.isEmpty())
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
			String joinstring=String.join("-", "welcome","world");
			System.out.println(joinstring);
			System.out.println(joinstring.lastIndexOf('w'));
			System.out.println(joinstring.replace('e', 'a'));
			System.out.println(joinstring=joinstring.replace("world", "java programmers"));
			
			System.out.println(str.charAt(5));// exception

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
