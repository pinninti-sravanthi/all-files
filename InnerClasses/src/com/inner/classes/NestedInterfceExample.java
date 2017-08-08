package com.inner.classes;

interface Outer1 {
	interface msg {//nested interface 
		void show();
	}
}

class NestedInterfceExample implements Outer1.msg {
	public void show() {
		System.out.println("msg");
	}

	public static void main(String[] args) {

		Outer1.msg obj = new NestedInterfceExample();
		obj.show();
	}

}
