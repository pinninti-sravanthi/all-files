package com.Practise.examples;

public class Ctype {
	static {
		// The online demo uses the example library "libc.so.6".
		// Have a look at the translated programs for real values.
		NativeHelper h = NativeHelper.get("libc.so.6");
		h.bindDirect(Ctype.class);
	}

	/**
	 * Return the lowercase version of C.
	 */
	public static native int tolower(int c);
}
