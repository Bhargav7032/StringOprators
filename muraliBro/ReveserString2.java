package com.muraliBro;

public class ReveserString2 {
	public static void main(String[] args) {
		String s="Bhargav";
		String rev="";
		for( int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
			System.out.println(rev);
		
	}

	}
