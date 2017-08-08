package com.collections.examples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class RandomAccess {
public static void main(String[] args) {
	ArrayList list=new ArrayList();
	LinkedList list2=new LinkedList();
	System.out.println(list instanceof Serializable);//true
	System.out.println(list instanceof Cloneable);//true
	System.out.println(list instanceof java.util.RandomAccess);//true
	System.out.println(list2 instanceof Serializable);//true
	System.out.println(list2 instanceof Cloneable);//true
	System.out.println(list2 instanceof java.util.RandomAccess);//false
}
}
