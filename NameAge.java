/*
Name: Exercise_KKrakowska
Description: Exercise - Java Development
Created by: Katarzyna Krakowska
Created on: 12/02/2019
*/

import java.util.Scanner;
public class NameAge{

	public static void main(String[] args){
	Scanner input = new Scanner (System.in);

		int count = 1;
		int age = 0;
		String name = "";


		System.out.print("Enter your name: ");
		name = input.nextLine();
		System.out.print("Enter number your age: ");
		age = input.nextInt();

		while (count <= age ){
		System.out.println(count+ ". "+name);
		count = count + 1;
		}

		System.out.println();

		Index.main (null);

	}//end main
}//end class
