import java.util.Arrays;

public class Decktester  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rank[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String suit[] = {"Spade","Heart","Club","Diamond"};
		int value[]= {12,13,1,2,3,4,5,6,7,8,9,10,11};
		Deck decks = new Deck(rank, suit, value);
		
		System.out.print(Arrays.toString(decks));
		
	}

}
