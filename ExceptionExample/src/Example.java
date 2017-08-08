import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {

		Example obj = new Example();

		obj.add();
		obj.sub();
		
		obj.div();
		obj.mul();
	}

	private void mul() {
		try {

			int a[] = new int[5];
			a[10] = 50;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of bound");
		}
	}

	private void div() {

		try {
			System.out.println("enter number1");
			Scanner scan4 = new Scanner(System.in);
			int number1 = scan4.nextInt();
			System.out.println("enter number2");

			int number2 = scan4.nextInt();

			int number3 = number1 / number2;
			System.out.println(number3);

		} catch (ArithmeticException e) {
			System.out.println("second number should  not be zero");
		}

	}

	void sub() {

		try {

			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("string is null");
		}

	}

	private void add() {
		try {
			System.out.println("enter number1");
			Scanner scan1 = new Scanner(System.in);
			int number1 = scan1.nextInt();

			System.out.println("enter number2");

			int number2 = scan1.nextInt();
			int number3 = number1 + number2;
			System.out.println(number3);

		} catch (InputMismatchException e) {
			System.out.println("you cant have strings here,enter only numbers");
		}

	}
}
