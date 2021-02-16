package com.bae;

public class Results {

	public static void main(String[] args) {
		int totalMark = calculateTotal(100, 65, 84);
		System.out.println("Your total score was " + totalMark + "!");
		double percentage = calculatePercentage(totalMark);
		System.out.println("Your total percentage was " + percentage + "!");
		
	}
	
	public static int calculateTotal(int physics, int chemistry, int biology) {
		System.out.println("You scored " + physics + " in Physics!");
		System.out.println("You scored " + chemistry + " in Chemistry!");
		System.out.println("You scored " + biology + " in Biology!");
		int total = physics + chemistry + biology;
		return total;
	}
	
	public static double calculatePercentage(double totalMark) {
		double percentage = (totalMark * 100) / 450;
		return percentage;
	}

}
