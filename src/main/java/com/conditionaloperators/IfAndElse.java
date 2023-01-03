package com.conditionaloperators;

public class IfAndElse {
	public static void main(String[] args) {
		int i=1000;
		int k=400;
		int j = 300;
		
		
	//I is  greaterthen k	
//		if(i>k) {
//			System.out.println("i is greater");
//		}else {
//			System.out.println("k is greater");
//		}
		
//		here using two conditions
		
		if(i>j&&i>k) {
			System.out.println("i is greater");
		}else if(k>j&&k>i) {
			System.out.println("k is greater");
		}else if(j>i&&j>k){
			System.out.println("j is greater");
		}else {
			System.out.println("all values are not equal");
		}
	
	}
}
