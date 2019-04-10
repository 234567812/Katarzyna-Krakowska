import java.util.Scanner;
public class Menu{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		int choice = 0;
		String output = "";

		System.out.println ("Select option.\n");
		System.out.println ("1. Lisa");
		System.out.println ("2. BigNumber");
		System.out.println ("3. Number");
		System.out.println ("4. Two");
		System.out.println ("5. NameAge");
		System.out.println ("6. ForLoop");
		System.out.println ("7. Months");
		System.out.println ("8. Cards");
		System.out.println ();
		System.out.print ("Enter choice: ");
		choice = input.nextInt();

		switch (choice) {
	 	case 1: System.out.println("Lisa");Lisa.main (null); 
	 	break;
          	case 2: System.out.println("BigNumber");
                break;
            	case 3: System.out.println("Number"); 
                break;
           	case 4: System.out.println("Two"); 
                break;
		case 5: System.out.println("NameAge"); 
	 	break;
          	case 6: System.out.println("ForLoop");
                break;
            	case 7: System.out.println("Months"); 
                break;
           	case 8: System.out.println("Cards"); 
                break;
		}//end switch
		
		if (choice <=0 || choice >=9){
		System.out.println("Invalid choice.");
		}//end if

}//end main
}//end class
		
