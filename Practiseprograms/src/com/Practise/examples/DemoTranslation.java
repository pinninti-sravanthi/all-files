package com.Practise.examples;

public class DemoTranslation {
	public final static int CHAR_SIZE = 26;

	public static void main(String[] args) {
		String8 str1 = new String8(50), str2 = new String8(50);
		int[] a1 = new int[CHAR_SIZE];
		String8 str2Rem = new String8(50);

		System.out.print("Enter string1: ");
		str1.copyFrom(STDIN_SCANNER.next());
		System.out.print("Enter string2: ");
		str2.copyFrom(STDIN_SCANNER.next());
		alphacheck(str1, a1);
		create(str2Rem, str2, a1);
		System.out.println("On removing characters from second string we get: " + str2Rem);
	}

	public static void alphacheck(String8 str, int[] a) {
		int index;

		for (int i = 0; Integer.compareUnsigned(i, str.length()) < 0; i++) {
			str.set(i, (byte) tolower(str.get(i)));
			index = str.get(i) - 'a';
			if (a[index] == 0) {
				a[index] = 1;
			}
		}
		System.out.println();
	}

	public static void create(String8 strRem, String8 str, int[] list) {
		int j = 0, index;
		for (int i = 0; Integer.compareUnsigned(i, str.length()) < 0; i++) {
			index = str.get(i) - 'a';
			if (list[index] == 0) {
				strRem.set(j++, str.get(i));
			}
		}
		strRem.set(j, '\0');
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
