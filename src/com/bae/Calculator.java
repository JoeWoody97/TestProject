package com.bae;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(addition(12, 8));
		System.out.println(multiplication(5, 8));
		System.out.println(subtraction(20, 10));
		division(5, 10);
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	public static int subtraction(int number1, int number2) {
		return number1 - number2;
	}

	public static void division(double number1, double number2) {
		if (number1 < number2) {
			double sum = number1 / number2;
			System.out.println(sum);
		} else {
			System.out.println("The division cannot be performed.");
		}
	}

}
