/*
Name: Exercise_KKrakowska

Description: Exercise - Java Development

Created by: Katarzyna Krakowska

Created on: 28/04/2019
*/

import java.util.Random;

public class Cards{

	//private field storing cards
	private String[] cards;
	//names of the suits
	final String[] suit_names = {"diamonds", "spades", "heart", "clubs"};
	//number of suits
	int suits = 4;
	//how many cards we have per a suit
	int cards_per_suit = 13;
	//constructor of a class
	public Cards(){
		//create array with suits*cards_per_suit elements
		cards = new String[suits*cards_per_suit];
		//and populate it 
		for (int j = 0; j < suits; j++){
			for (int i = 0; i < cards_per_suit; i++){
				cards[j * cards_per_suit + i] = String.valueOf(i+1)+"_of_"+suit_names[j];
			}
		}				
	}
	//getter method that will be used to get cards array 
	public String[] getCards(){
		return cards;
	}

	//shuffle method 
	public String[] shuffle(String[] deck){
		Random rnd = new Random();
		for (int i = deck.length - 1; i >= 0; i--){
			int index = rnd.nextInt(i+1);
			String a = deck[index];
			deck[index] = deck[i];
			deck[i] = a;
		}
		return deck;
	}

	//method to print cards from a private array
	public void printCards(){
		for (int j = 0; j < suits*cards_per_suit; j++){
			System.out.println(cards[j]);
		}
	}

	//this method will be called from Index (Exercise 9)
	public static void exercise(){
		//instantiate class
		Cards cards = new Cards();
		//get cards in order to shuffle them
		String[] c = cards.getCards();
		//do the shuffling
		cards.shuffle(c);
		//and print out the resulting deck
		cards.printCards();
	}

	//main is the same as exercise, used for testing purposes
	public static void main(String[] val){
		Cards cards = new Cards();
		String[] c = cards.getCards();
		cards.shuffle(c);
		cards.printCards();
		
		Index.main (null);
	}
}

