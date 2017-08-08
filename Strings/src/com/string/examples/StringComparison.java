package com.string.examples;

public class StringComparison {
	 public static String concatWithString()    {  
	        String t = "chennai";  
	        for (int i=0; i<10000; i++){  
	            t = t + "is in tamilnadu";  
	        }  
	        return t;  
	    }  
	    public static String concatWithStringBuffer(){  
	        StringBuffer sb = new StringBuffer("chennai");  
	        for (int i=0; i<10000; i++){  
	            sb.append("is in tamilnadu");  
	        }  
	        return sb.toString();  
	    }  
	    public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        concatWithString();  
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        concatWithStringBuffer();  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	    }  
}
