package mjtuckChap1and2;

import java.util.Scanner;

public class Proj4 {

	public static void main(String[] args) {
		//Mitchell Tucker SPC ID#2429488
		//This program will prompt user to enter dimensions of a rectangle and prints perimeter and area of the rectangle
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the length of the rectangle: ");//user inputs length
		double length = input.nextDouble();

		System.out.println("Please enter the width of the rectangle: ");//user inputs width
		double width = input.nextDouble();

		System.out.println("Lets calculate the area and perimeter for you: ");
		System.out.println();

		//Formula will calculate area and perimeter and display for user
		double perimeter = (length + width) * 2;
		double area = (length * width);
		System.out.println("The perimeter of your rectangle is: " + perimeter);
		System.out.println("The area of your rectangle is: " + area);


	}

}
