/*
Name: Exercise1_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 24/02/2019

*/


import java.util.Scanner;
public class Two{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int num1 = 0;
		int num2 =0;


		System.out.print("Enter first number: ");
		num1=input.nextInt();

		System.out.print("Enter second number: ");
		num2=input.nextInt();

		if (num1 == 2 && num2 == 2){
		System.out.println("Both numbers equal 2.");
		}else if ((num1 == 2) || (num2 == 2)){
			if (num1 == 2){
			System.out.println("First number equals 2.");
			}else{
			System.out.println("Second number equals 2.");
			}
	   }else{
		   System.out.println("Both numbers are not equal 2.");
	   }

	}//end main
}//end class