package com.bae;

public class Coins {

	public static void main(String[] args) {

		changeCalc(458, 2000);
	}

	public static void changeCalc(int cost, int paidAmount) {

		int twentyPoundNote = 0;
		int tenPoundNote = 0;
		int fivePoundNote = 0;
		int twoPoundCoin = 0;
		int onePoundCoin = 0;
		int fiftyPenceCoin = 0;
		int twentyPenceCoin = 0;
		int tenPenceCoin = 0;
		int fivePenceCoin = 0;
		int twoPenceCoin = 0;
		int onePenceCoin = 0;

		int change = paidAmount - cost;

		while (change >= 2000) {
			change = change - 2000;
			twentyPoundNote++;
		}

		while (change >= 1000) {
			change = change - 1000;
			tenPoundNote++;
		}

		while (change >= 500) {
			change = change - 500;
			fivePoundNote++;
		}

		while (change >= 200) {
			change = change - 200;
			twoPoundCoin++;
		}

		while (change >= 100) {
			change = change - 100;
			onePoundCoin++;
		}

		while (change >= 50) {
			change = change - 50;
			fiftyPenceCoin++;
		}

		while (change >= 20) {
			change = change - 20;
			twentyPenceCoin++;
		}

		while (change >= 10) {
			change = change - 10;
			tenPenceCoin++;
		}

		while (change >= 5) {
			change = change - 5;
			fivePenceCoin++;
		}

		while (change >= 2) {
			change = change - 2;
			twoPenceCoin++;
		}

		while (change >= 1) {
			change = change - 1;
			onePenceCoin++;
		}

		System.out.println("Your change is: " + twentyPoundNote + "x £20 notes");
		System.out.println("Your change is: " + tenPoundNote + "x £10 notes");
		System.out.println("Your change is: " + fivePoundNote + "x £5 notes");
		System.out.println("Your change is: " + twoPoundCoin + "x £2 coins");
		System.out.println("Your change is: " + onePoundCoin + "x £1 coins");
		System.out.println("Your change is: " + fiftyPenceCoin + "x 50p coins");
		System.out.println("Your change is: " + twentyPenceCoin + "x 20p coins");
		System.out.println("Your change is: " + tenPenceCoin + "x 10p coins");
		System.out.println("Your change is: " + fivePenceCoin + "x 5p coins");
		System.out.println("Your change is: " + twoPenceCoin + "x 2p coins");
		System.out.println("Your change is: " + onePenceCoin + "x 1p coins");

	}

}
