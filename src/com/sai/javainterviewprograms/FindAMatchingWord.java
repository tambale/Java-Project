package com.sai.javainterviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAMatchingWord {

	public static void main(String[] args) {
		String s = "saitejasaitejasaitejasaitejabheemesh";
		Pattern p = Pattern.compile("kiran");
		Matcher m = p.matcher(s);
		int count = 0;
		while (m.find()) {
			System.out.println(m.start());
			
			
			count=count+1;
		}
		System.out.println(count);
		
		//This is Bheemesh from UHG
	}

}
