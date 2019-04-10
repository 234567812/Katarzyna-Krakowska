import java.util.Scanner;
public class Times{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int i = 1;
		int number = 0;
		int choice = 0;
		String output = "";

		System.out.print ("Enter number: ");
		number = input.nextInt ();
		System.out.println ();

		System.out.println ("Select option 1 or 2.\n");
		System.out.println ("1. Addition table (1-12).");
		System.out.println ("2. Multiplication table (1-12).");
		System.out.println ();
		System.out.print ("Enter choice: ");
		choice = input.nextInt();

	if(choice==1){
		//addition
while (i<=12){
	output +=number +" + " + i + " = " +(number + i) +"\n";
i++;
}
}else if (choice == 2){
//multiplication
while (i<= 12){
output +=number +" * " + i + " = " +(number * i) +"\n";
i++;
}
}else{
output = "Invalid choice.";
}
System.out.println (output);
		
		Index.main (null);
}
}
