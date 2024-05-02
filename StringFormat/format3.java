package com.StringFormat;

public class format3{
		public static void main(String[] args) {
			String name="Raju";
			String st1=String.format("name is %s",name);
			String st2=String.format("value is %f", 32.33445);
			String st3=String.format("value is 32.34f",32.33445);
			System.out.println(st1);
			System.out.println(st2);
			System.out.println(st3);
			
		}
	}


