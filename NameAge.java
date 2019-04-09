/*
Program Name: NameAge

Variables/Types: int count; int number; String name;

Inputs: yes

If/else statements: no

Loops: yes

Loop how many times: unknown
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



	}//end main
}//end class