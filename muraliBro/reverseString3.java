package com.muraliBro;

public class reverseString3 {
public static void main(String[]args) {
	String name="bhagi";
	String rev=" ";
	for(int i=0;i<name.length();i++) {
		rev=name.charAt(i)+rev;
	}		
System.out.println(rev);
}
}