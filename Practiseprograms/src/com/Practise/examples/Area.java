package com.Practise.examples;

import java.util.Scanner;

class AreaCalculation {
	float area(float side) {
		float area = side * side;
		//System.out.println("area of square is" + area);
		return area;
	}

	float area(float length, float breadth) {
		float area = length * breadth;
		//System.out.println("area of rectangle is" + area);
		return area;
	}

	float area(float constant, float baseobj, float heightobj) {
		float area = constant * baseobj * heightobj;
		//System.out.println("area of triangle is" + area);
		return area;
	}

}

public class Area {
	public static void main(String[] args) {
		String ch;
		do {
			AreaCalculation areaobj = new AreaCalculation();
			System.out.println("enter 1 for area of square");
			System.out.println("enter 2 for area of rectangle");
			System.out.println("enter 3 for area of triangle");

			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("enter side to find area of square");
				float squareobj = scan.nextFloat();
				areaobj.area(squareobj);
				float result = areaobj.area(5);// testcase
				float expected = 25;
				test(result, expected);
			} else if (choice == 2) {
				System.out.println("enter side to find area of rectangle");
				float lengthobj = scan.nextFloat();
				float breadthobj = scan.nextFloat();
				areaobj.area(lengthobj, breadthobj);
				float result = areaobj.area(5, 4);// testcase
				float expected = 20;
				test(result, expected);
			} else if (choice == 3) {
				System.out.println("enter side to find area of triangle");
				float baseobj = scan.nextFloat();
				float heightobj = scan.nextFloat();
				float constant = (float) 0.5;
				areaobj.area(constant, baseobj, heightobj);
				float result = areaobj.area(constant, 2, 4);// testcase
				float expected = (float) 4.0;
				test(result, expected);
			}

			System.out.println("do you want once again?(y/n)");

			ch = scan.next();

		} while (ch != "n");
		

	}

	private static void test(float result, float expected) {
		
		
		//area("a");
		if (result == expected) {
			System.out.println("test pass");
		} else {
			System.out.println("test fail");
		}
	}

}
