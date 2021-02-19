package com.bae;

public class BlackJack {

	public static void main(String[] args) {
		int winningNumber = play(21, 8);
		System.out.println(winningNumber);

	}

	public static int play(int number1, int number2) {
		if ((number1 > number2) && (number1 <= 21)) {
			return number1;
		} else if ((number2 > number1) && (number2 <= 21)) {
			return number2;
		}

		return 0;
	}

}
