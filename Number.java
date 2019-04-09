/*
Name: Exercise1_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 12/02/2019

*/


import java.util.Scanner;
public class Number{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int number = 0;

		System.out.print("Enter number: ");
		number = input.nextInt();

		if (number > 0){
		System.out.println(number+ " is a possitive number.");
		}else if (number < 0){
		System.out.println(number+ " is negative number.");
		}else if(number == 0){
		System.out.println("Number is 0.");

		}
		System.out.println();

	}//end main
}//end class