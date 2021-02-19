package com.bae;

public class Results {

	public static void main(String[] args) {
		int totalMark = calculateTotal(100, 65, 84);
		System.out.println("Your total score was " + totalMark + "!");
		double percentage = calculatePercentage(totalMark);

		if (percentage > 60) {
			System.out.println("You have passed with a percentage of: " + percentage + "%");
		} else {
			System.out.println("You have failed with a percentage of: " + percentage + "%");
		}

	}

	public static int calculateTotal(int physics, int chemistry, int biology) {
		System.out.println("You scored " + physics + " in Physics!");
		System.out.println("You scored " + chemistry + " in Chemistry!");
		System.out.println("You scored " + biology + " in Biology!");
		int total = physics + chemistry + biology;

		if (physics < 90) {
			System.out.println("You have failed Physics!");
		} else if (chemistry < 90) {
			System.out.println("You have failed Chemistry!");
		} else if (biology < 90) {
			System.out.println("You have failed Biology");
		}
		return total;
	}

	public static double calculatePercentage(double totalMark) {
		double percentage = (totalMark * 100) / 450;
		return percentage;
	}

}
