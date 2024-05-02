package com.String;

public class CharAtExample4 {
public static void main(String[] args) {
	String srt="Welcome to bhargav";
	int count=0;
	for(int i=0; i<=srt.length()-1;i++){
		
	if(srt.charAt(i)=='a') {
		count++;
	}	
	}
		System.out.println("frequency of a  is"+count);
	}
}


