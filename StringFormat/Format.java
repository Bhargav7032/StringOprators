package com.StringFormat;

public class Format {
	public static void main(String[] args) {
		String name="Bhargav";
		String sr1=String.format("name is %s",name);
		String sr2=String.format("value is %f", 32.33434);
		String sr3=String.format("value is %32.12f", 32.33434);
		System.out.println(sr1);
		System.out.println(sr2);
		System.out.println(sr3);
	}

}

