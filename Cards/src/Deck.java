import java.util.ArrayList;
import java.util.Collections;

public class Deck {
private ArrayList<Card> unDealt;
private ArrayList<Card> Dealt;
String rank[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
String suit[] = {"Spade","Heart","Club","Diamond"};
int pointValue[]= {12,13,1,2,3,4,5,6,7,8,9,10,11};

public Deck(String[]rank,String suit[],int[]value)
{
	this.Dealt = new ArrayList<Card>();
	this.unDealt = new ArrayList<Card>();
	for(int i =0; i<rank.length;i++)
	{
		for(int j=0;j<suit.length;j++)
		{
			unDealt.add(new Card(rank[i],suit[j],value[i]));
		}
	}
}
public boolean isEmpty() {
	if(unDealt.size()==0) {
		return true;
	}
	else 
	{
		return false;
	}
}
public int size() {
	return unDealt.size();
}
public Card deal() {
	for(int i=0;i<unDealt.size();i++)
	{
	unDealt.get(0);
	unDealt.remove(0);
	}
	return null;
		}
public void shuffle()
{
	Collections.shuffle(unDealt);
}
public ArrayList<Card> getunDealt() {
	return unDealt;
}


public ArrayList<Card> getDealt() {
	return Dealt;
}


}
