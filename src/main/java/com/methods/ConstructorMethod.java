package com.methods;

public class ConstructorMethod {
	
	 int  a ;
	 String name;
// default constructor
	public ConstructorMethod() {
		this. a = 10;
	}
	
	
	public ConstructorMethod(int aa, String names) {
		name= names;
		a= aa;
	}
	

	public static void main(String[] args) {
    ConstructorMethod cm =new ConstructorMethod(100,"kiran");
    System.out.println(cm.a);
    
    System.out.println(cm.a+" "+cm.name);
	}

}
