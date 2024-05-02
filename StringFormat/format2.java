package com.StringFormat;

public class format2 {
public static void main(String[] args) {
	String name="MohanBabu";
	String sm1=String.format("name is %s",name);
	String sm2=String.format("value is %f", 28.33443);
	String sm3=String.format("value is %28.45f",28.33443);
	
System.out.println(sm1);
System.out.println(sm2);
System.out.println(sm3);
}
}
