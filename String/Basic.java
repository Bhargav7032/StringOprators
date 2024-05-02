package com.String;

public class Basic {
public static void main(String[] args) {
	String s1="Bhargav";
	String s2="Bhargav";
	String s3=new String("Bhargav");
	System.out.println(s2==s1);//true
	System.out.println(s3==s1);
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}
