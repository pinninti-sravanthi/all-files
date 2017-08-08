package com.Interface.example;

 class Baseclass{
public int obj1=10;;
private int obj2=20;
protected int obj3=30;
int obj4;
public int getobj1()
{
	return obj1;
}
private int getobj2()
{
	return obj2;
}
protected int getobj3()
{
	return obj3;
}
int getobj4()
{
	return obj4;
}
public void setobj1(int obj1)
{
	this.obj1=obj1;
}
private void setobj2(int obj2) {
	this.obj2=obj2;
}
protected void setobj3(int obj3) {
	this.obj3=obj3;
}
void setobj4(int obj4) {
	this.obj4=obj4;
}
}
public class Subclass1 extends Baseclass{
	public static void main(String[] args) {
		Subclass1 obj=new Subclass1();
		obj.obj4=0;

		System.out.println("the value is:"+obj.obj1);
		obj.setobj1(20);
		System.out.println("value after setting is:"+obj.obj1);
		//System.out.println("the value is:"+obj.obj2);
		//obj.setobj2(50);
		//System.out.println("value after setting is:"+obj.obj2);
		System.out.println("the value is:"+obj.obj3);
		obj.setobj3(10);
		System.out.println("value after setting is:"+obj.obj3);
		System.out.println("the value is:"+obj.obj4);
		obj.setobj4(30);
		System.out.println("value after setting is:"+obj.obj4);
		
	}
}
