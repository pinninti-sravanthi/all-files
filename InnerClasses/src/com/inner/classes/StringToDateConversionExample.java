
package com.inner.classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConversionExample {
	public static void main(String[] args) throws ParseException {
		
	String sDate1="15/07/2017";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(sDate1+"\t"+date1);  
}  

}
