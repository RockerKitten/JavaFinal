package War;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args)
    {
       Deck deck = new Deck();
       deck.shuffle();

        /*for (Card i : deck.getCards())
        {
            i.setName();
            System.out.println(i.getName());
        }*/



        /*ArrayList<Card> shuffledDeck = Deck.shuffle(deck);
        for (Card i : shuffledDeck)
        {
            System.out.println(Card.getName());
        }*/
    }
}
