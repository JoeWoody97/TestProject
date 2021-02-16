package com.bae;

public class Test {

	public static void main(String[] args) {
		int i = 37;

		if (i % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		if (true || false) {
			System.out.println("hello");
		}

		int day = 2097;

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("There are only 7 days in a week");
		}

	}

}
