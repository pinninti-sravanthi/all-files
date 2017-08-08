package com.date.examples;

import java.util.Scanner;

public class WeekExample {
	enum Week{ 
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4); 

		private int value;
		private Week(int value){
		this.value=value;
		}
		}
	public static void main(String[] args) {
		
		
		System.out.println("please select the number from 1-7");
		Scanner scan=new Scanner(System.in);
		int numberobj=scan.nextInt();
		switch(numberobj)
		{
		case 1:for (Week s : Week.values())  
			System.out.println(s+" "+s.value);  
		break;
		}
	}
	
		
		
		
		
		
		
		
		
		
		
		//for (iterate s : iterate.values())  
		//	System.out.println(s+" "+s.value);  
	}
}
