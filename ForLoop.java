/*
Program Name: Odd

Variables/Types: int count; int number; String name;

Inputs: yes

If/else statements: no

Loops: yes

Loop how many times: unknown
*/

import java.util.Scanner;
public class ForLoop{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int total = 1;

	System.out.print(i+". Enter number: ");
	num=input.nextInt();

	for (int i= 0; i <= 10; i = i + 2){
        total = total + i;
	}

	System.out.println("Total: "+total);
	
	Index.main (null);


	}//end main
}//end class
