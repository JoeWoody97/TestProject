package com.bae;

public class UniqueSum {

	public static void main(String[] args) {
		System.out.println(sum(1, 3, 3));

	}

	public static int sum(int number1, int number2, int number3) {
		if (number1 == number2) {
			return number3;
		} else if (number1 == number3) {
			return number2;
		} else if (number2 == number3) {
			return number1;
		} else if ((number1 == number2) && (number1 == number3)) {
			return 0;
		} else {
			return number1 + number2 + number3;
		}
	}

}
