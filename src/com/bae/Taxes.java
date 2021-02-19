package com.bae;

public class Taxes {

	public static int salary = 28000;

	public static void main(String[] args) {
		double tax = salaryTax(salary);
		double taxedAmount = taxedCalc(tax);
		System.out.println("You will pay £" + taxedAmount + " in tax!");

	}

	public static double salaryTax(int salary) {
		if ((salary > 0) && (salary < 15000)) {
			System.out.println("0% tax");
			return 0.0;
		} else if ((salary >= 15000) && (salary < 20000)) {
			System.out.println("10% tax");
			return 0.10;
		} else if ((salary >= 20000) && (salary < 30000)) {
			System.out.println("15% tax");
			return 0.15;
		} else if ((salary >= 30000) && (salary < 45000)) {
			System.out.println("20% tax");
			return 0.20;
		} else {
			System.out.println("25% tax");
		}
		return 0.25;
	}

	public static double taxedCalc(double tax) {
		double taxedAmount = salary * tax;

		return taxedAmount;
	}

}
