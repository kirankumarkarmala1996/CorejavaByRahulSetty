package com.methods;

public class MyMethod {

	double numb = 100.0;

	public static void main(String[] args) {

		MyMethod m = new MyMethod();
		m.method();
		String methodname = m.method1();
		System.out.println(methodname);

		m.num();

		int number = m.num1();
		System.out.println(number);

		boolean b = m.booleantype();
		System.out.println(b);

		boolean bb = m.booleantype1();
		System.out.println(bb);

		MyMethod d = m.doubletype();
		System.out.println(d);

	}

	public void method() {
		System.out.println("this is method");
	}

//	this method has return type String
	String method1() {
		return "method1";
	}

//	this  method nothing has return type just it will print what you have given
	public void num() {
		System.out.println(10);
	}

//	this method has return type int
	public int num1() {
		return 10;
	}

	public boolean booleantype() {

		return true;
	}

	public boolean booleantype1() {
		return false;
	}

	public MyMethod doubletype() {
		this.numb = numb;
		return this;
	}

}
