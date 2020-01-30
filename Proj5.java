package mjtuckChap1and2;

import java.util.Scanner;

public class Proj5 {
	//This program will return the quotient for the user between 2 numbers
	public static void main(String[] args) {
		//Mitchell Tucker SPC ID#2429488
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your two favorite numbers");
		System.out.println();

		System.out.println("Number 1: ");
		float num1 = input.nextFloat();

		System.out.println("Number 2: ");
		float num2 = input.nextFloat();

		float quotient = num1 / num2;
		System.out.println("Your first favorite number divided by your second favorite number is: " + quotient);

		System.out.println();

		quotient -= 2.5;
		System.out.println("Your divided result minus 2.5 is: " + quotient);


	}

}
