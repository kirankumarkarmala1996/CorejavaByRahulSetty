package com.CoreJava;

public class ReverseTheStringWords {
	public static void main(String[] args) {

		String s = "God is Great";
//		String[] splitedstring = s.split(" ");
		int len = s.length();
		String rev=" ";
		
		for (int i = len - 1; i >= 0; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
//		// reverse the string
//		for (int i = s.length() - 1; i >= 0; i--) {
//			System.out.println( s.charAt(i));
//		}

//		String rev = " ";
//
//		int len = s.length();
//		for (int i = len - 1; i >= 0; i--) {
//			s.charAt(i);
//			rev += s.charAt(i);
//
//		}
//		System.out.println("string 2 : "+rev);
	}

}
