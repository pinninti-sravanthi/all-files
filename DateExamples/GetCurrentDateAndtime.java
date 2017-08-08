package com.Practise.examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetCurrentDateAndtime {
	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(dateFormat.format(cal.getTime()));
	}
}