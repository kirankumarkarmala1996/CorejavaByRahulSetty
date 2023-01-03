package com.CoreJava;

public class Strings {

	public static void main(String[] args) {
//it will store in the string constant pool
		String s = "karmala kiran kumar";
		String s1 = "Kamsala kiran kumar";

//it will store in the heap area
		String ss = new String("hello java");
		
		String[] splitedstring=s.split("kiran");
//it will remove the left and right spaces
//		System.out.println(splitedstring[0]);
//		System.out.println(splitedstring[1]);
//		System.out.println(splitedstring[1]);
////		it will remove the left and right space
//		System.out.println(splitedstring[1].trim());
		

//		for(int i=0;i<splitedstring.length-1;i++) {
//			System.out.println(splitedstring[i]);
//		}
		System.out.println("======================");
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
