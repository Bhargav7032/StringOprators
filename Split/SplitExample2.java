package com.Split;

import java.util.Arrays;

public class SplitExample2 {
	public static void main(String[] args) {
		String s1 = "Hello Java";
		String s2 = "Hey Java How are you";
		String s3 = "java What are you doing";

		// System.out.println(Arrays.toString(s1.split(" ")));
		// System.out.println(Arrays.toString(s2.split(" ")));
		// System.out.println(Arrays.toString(s3.split(" ")));

		String[] a = s1.split("a");
		for( String j:a) {
			System.out.println(j);
			
			
			String[] b=s2.split("a");
			for(String k:b ) {
				System.out.println(k);
				
				
				String[]c=s3.split("a");
				for(String q:c) {
					System.out.println(q);
				}
			}
		}

	}

}
