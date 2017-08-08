package com.string.examples;

public class StringBufferExample {
public static void main(String[] args) {
	StringBuffer strbuf=new StringBuffer("Engineering");
	System.out.println(strbuf.capacity());
	strbuf.append("Education");
	strbuf.append("System");
	System.out.println(strbuf);
	System.out.println(strbuf.insert(0, "Indian"));
	System.out.println(strbuf.replace(6, 17, "'s"));
	System.out.println(strbuf.delete(17, 23));
	System.out.println(strbuf.reverse());
System.out.println(strbuf.capacity());
	
	
}
}
