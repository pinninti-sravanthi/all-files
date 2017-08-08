package com.Interface.example;

public class Fibrecursivefun {
	static int num1=0,num2=1,count=12;
public static void main(String[] args) {
	System.out.println(num1+""+num2);
	Fib(count-2);
}
static void Fib(int count)
{
	if(count>0)
	{
	
	int num3=num1+num2;
	System.out.println(num3);
	num1=num2;
	num2=num3;
	Fib(count-1);
}
}

}
