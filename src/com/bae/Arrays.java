package com.bae;

public class Arrays {

	public static void main(String[] args) {

//		int[] array = new int[10];
//
//		array[0] = 1;
//		array[1] = 5;
//		array[2] = 8;
//		array[3] = 12;
//		array[4] = 7;
//		array[5] = 3;
//		array[6] = 15;
//		array[7] = 22;
//		array[8] = 11;
//		array[9] = 18;
//
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		System.out.println(array[5]);
//		System.out.println(array[6]);
//		System.out.println(array[7]);
//		System.out.println(array[8]);
//		System.out.println(array[9]);

//		int[] array = new int[10];
//
//		for (int i = 0; i < 10; i++) {
//			array[i] = i;
//			System.out.println(array[i]);
//		}
//
//		for (int i = 0; i < 10; i++) {
//			array[i] = array[i] * 10;
//			System.out.println(array[i]);
//		}

		System.out.println(addDigits(88));

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
