package com.Interface.example;

public strictfp interface Strictfptest {
	float add(float num1,float num2);
}



strictfp class Subclass implements Strictfptest{
	
	 public strictfp float add(float num1,float num2)
	 {
		 
		 return (num1+num2);
	 }
	 public static void main(String[] args) {
		 Strictfptest obj=new Subclass();
		 System.out.println(obj.add(10.12f,12.23f));
	}
	
}