package com.Practise.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SimpleDateFormatexample {


public static void main(String[] args) {
	//Date date=new Date();
	SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
	Date sdate;
	try {
		sdate = formatter.parse("13/07/2017");
		System.out.println(sdate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
