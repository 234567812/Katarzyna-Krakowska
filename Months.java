public class Months{

	public static void main(String[] args){

		
	String[] subjects = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	String search = "r";

		search = "r";
		boolean found = false;

		for (int i = 0; i < subjects.length; i++){
			if (subjects[i].equals(search)){
			System.out.println("Subjects found. Stored in index "+i);
			found = true;
			}
		}
		if(!found) {
			System.out.println("Subject not found.");
			}

	}//end main
}//end class