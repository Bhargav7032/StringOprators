package com.Split;


import java.util.Arrays;

public class SplitEaxmple {
	public static void main(String[]args) {
		String s1="Hello Bhargav How are you ?";
		String s2="Bhargav what are you doing ?";
		String s3="Bhargav What do you want !";
		
//		System.out.println(Arrays.toString(s1.split(" ")));
//		System.out.println(Arrays.toString(s2.split(" ")));
//		System.out.println(Arrays.toString(s3.split(" ")));
	
		String[] a = s1.split("o");
		for( String j:a) {
			System.out.println(j);
			
			String[]b=s2.split("a");
			for(String k:b) {
				System.out.println(k);
				
				String[]c=s3.split("w");
				for(String l:c) {
					System.out.println();
				}
			}

	} 
	}
}


