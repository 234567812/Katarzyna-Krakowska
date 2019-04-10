/*
Name: Exercise1_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 12/02/2019

*/

import java.util.Scanner;
public class BigNumber{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int number = 0;
		

		System.out.print("Enter number: ");
		number = input.nextInt();
		
		if (number>1000000){
		
		System.out.print( "That is a big number.");
		}
		
		Index.main (null);
		
	}//end main
}//end class
