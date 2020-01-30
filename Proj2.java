package mjtuckChap1and2;

import java.util.Scanner;

public class Proj2 {

	public static void main(String[] args) {
		// Mitchell Tucker SPC ID# 2429488
		// This program will display the total price of what the user is purchasing
		Scanner input = new Scanner(System.in);


		System.out.println("Please enter the unit price: "); //user enters unit price
		double unitprice = input.nextDouble();

		System.out.println("Please enter the quantity: "); // user enters quantity
		double quantity = input.nextDouble();

		double subtotal = unitprice * quantity; 
		System.out.println("The total amount you owe is: " + subtotal); // total price is displayed from user input


	}

}

