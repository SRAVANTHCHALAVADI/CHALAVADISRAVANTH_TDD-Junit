package com.epam;

public class RemoveAInFirstTwoCharacters {

	public String removeA(String input) {
		if((input.charAt(0)=='a'||input.charAt(0)=='A')&&(input.charAt(1)=='a'||input.charAt(1)=='A')&&input.length()>1) {
			return input.substring(2);
		}
		else if(input.charAt(0)=='a'||input.charAt(0)=='A') {
			return input.substring(1);
		}
		else if(input.charAt(1)=='a'||input.charAt(1)=='A') {
			return input.charAt(0)+""+input.substring(2);
		}
		else {
			return input;
		}
		
		}
}
