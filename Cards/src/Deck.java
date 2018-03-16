import java.util.ArrayList;

public class Deck {
private ArrayList<Card> unDealt;
private ArrayList<Card> Dealt;
String rank[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
String suit[] = {"Spade","Heart","Club","Diamond"};
int value[]= {12,13,1,2,3,4,5,6,7,8,9,10,11};
public void deck(String[]rank,String suit[],int[]value)
{

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
public ArrayList<Card> getDealt() {
	return Dealt;
}


}
