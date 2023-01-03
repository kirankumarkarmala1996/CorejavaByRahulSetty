package com.CoreJava;

public class Reverse {
	public static void main(String[] args) {
		String s= "Hello java";
		int len = s.length();
		String rev=" ";
		
		for (int i = len - 1; i >= 0; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	}

}
