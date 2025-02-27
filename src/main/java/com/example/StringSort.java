package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
	
	public static String customStringSort(String input) {
		
		List<Long> num = new ArrayList<>();
		List<Character> lowerCases = new ArrayList<>();
		List<Character> upperCases = new ArrayList<>();
		List<Character> others = new ArrayList<>();
		for (int i = 0; i < input.length();) {  
		    char ch = input.charAt(i);

		    if (Character.isDigit(ch)) {
		        long n = 0;
		        int j = i; 
		        for (; j < input.length() && Character.isDigit(input.charAt(j)); j++) {
		            n = n * 10 + (input.charAt(j) - '0');
		        }

		        num.add(n);
		        i = j;  
		    } else {
		        if (Character.isLowerCase(ch)) {
		            lowerCases.add(ch);
		        } else if (Character.isUpperCase(ch)) {
		            upperCases.add(ch);
		        } else {
		            others.add(ch);
		        }
		        i++; 
		    }
		}

		Collections.sort(num);
		Collections.sort(lowerCases);	
		Collections.sort(upperCases);
		Collections.sort(others);
		
		StringBuilder result = new StringBuilder();
        for (long c : num) { 
            result.append(c);
        }
        for (char c : lowerCases) { 
            result.append(c);
        }
        for (char c : upperCases) { 
            result.append(c);
        }
        for (char c : others) { 
            result.append(c);
        }

		return result.toString();
	}
	
	public static void main(String[] args) {
		String outputOne = customStringSort("A11a4");
		System.out.println("Output string : "+outputOne);
	}
	
}

