/*
Name: Exercise_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 14/04/2019
*/

public class Months{

	public static void main(String[] args){
	
	String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	for (int i = 0; i < months.length; i++) {
       
        if(months[i].contains ("r")){
	System.out.println (months[i]);
	
	}//end if
	}//end for
	
	Index.main (null);
		
	}//end main
}//end class
