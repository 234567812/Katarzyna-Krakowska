/*
Name: Exercise_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 12/03/2019
*/

import java.util.Scanner;
public class ForLoop{


	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

	int sum = 0;
	int num = 0;

	
	for (int i = 1; i <= 10; i++){
	System.out.print("Enter number "+i+ ": ");
	num = input.nextInt();
	if (num % 2 != 0) {
	sum = sum + num;
	}
	}
	
	System.out.println("Sum of odd numbers is: "+sum);

	Index.main (null);
		
	}//end main
}//end class
   
