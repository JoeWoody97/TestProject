package com.bae;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int addDigits(int number) {
		int finalValue = 0; // creating a blank variable
		String numberString = String.valueOf(number); // converting number into a string
		char[] array = numberString.toCharArray(); // placing the string into a char array e.g. {'5', '4'}
		for (int i = 0; i < array.length; i++) { // looping through each character
			finalValue += Character.getNumericValue(array[i]); // changing the character to a number
			return finalValue;
		}
	}
}
