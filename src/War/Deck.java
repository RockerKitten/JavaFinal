package War;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{
    ArrayList<Card> cards;
    ArrayList<String> suit = new ArrayList<>(Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs"));

    // used to instantiate Deck with all 52 cards
    public Deck ()
     {
        ArrayList<Card> nCards = new ArrayList<>();
        for (String x : suit) {
            int i =2;
            while (i < 15) {
                Card card = new Card(i,x);
                card.setName();
                nCards.add(card);
                //System.out.println(card.getName()); //Logic check
                i++;
            }
        }
        this.cards = nCards;
    }

    public ArrayList<Card> getCards()
    {return cards;}

    // shuffles a deck
    public void shuffle()
    {Collections.shuffle(cards);}

    // removes and returns the top card
    public Card draw()
    {return cards.remove(0);}


}
