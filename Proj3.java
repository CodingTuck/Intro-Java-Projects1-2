package mjtuckChap1and2;

import java.util.Scanner;

public class Proj3 {

	public static void main(String[] args) {
		// Mitchell Tucker SPC ID#2429488
		// This program will prompt the user to enter Fahrenheit and it will return celcius
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter degrees in fahrenheit: "); // user enters degrees in fahrenheit
		double fahrenheit = input.nextDouble();
		System.out.println();

		System.out.println("Now lets convert this to celcius.");
		System.out.println();

		//Formula converts fahrenheit to celcius
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println(fahrenheit + " degrees is " + 
				celsius + " in degrees celcius."); // displays the converted degrees celsius 

	}

}
