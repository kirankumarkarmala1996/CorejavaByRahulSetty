package com.conditionaloperators;

public class NestedIf {
	public static void main(String[] args) {
		
		int day =7;
		
//		when we use condition inside another condition nested condition
		
//		when we use  in if condition another if else condition is called nested if
		
		if(day==1) {
			System.out.println("monday");
		}else if(day ==2) {
			System.out.println("tuesday");
		}else if(day ==3) {
			System.out.println("wednesday");
		}else if(day ==4) {
			System.out.println("thursday");
		}else if(day ==5) {
			System.out.println("friday");
		}else if(day ==6) {
			System.out.println("saturday");
		}else if(day ==7) {
			System.out.println("sunday");
		}else {
			System.out.println("pass the correct week num");
		}
		
	}

}
