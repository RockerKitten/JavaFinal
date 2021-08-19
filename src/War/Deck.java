package War;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck{
    static ArrayList<Card> cards;
    static ArrayList<String> suit = new ArrayList<>(Arrays.asList("Hearts", "Diamonds", "Spades", "Clubs"));

    public Deck ()
     {
        ArrayList<Card> nCards = new ArrayList<>();
        for (String x : suit) {
            int i =2;
            while (i < 15) {
                Card card = new Card(i,x);
                nCards.add(card);
                System.out.println(Card.getName()); //Logic check
                i++;
            }
        }
        Deck.cards = nCards;
    }

    public static ArrayList<Card> getCards()
    {
        return cards;
    }


    public static void shuffle() {
       Collections.shuffle(cards);
        for (int i =0; i < cards.size();i++)
        {
            cards.get(i).description();

        }
    }

    public static Card draw()
    {
        return null;
    }


}
