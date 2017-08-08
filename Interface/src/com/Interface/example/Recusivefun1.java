package com.Interface.example;

public class Recusivefun1 {
public static void main(String[] args) {
	System.out.println("factorial using recursion is:"+fact(5));
}

 static int fact(int obj) {
	 if(obj==1)
		 return 1;
	 else
		 return obj*fact(obj-1);
 }
}

