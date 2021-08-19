package War;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int score;
    private String name;

    // defines player
    public Player(String name)
    {
        this.name = name;
        setHand();
        this.score = 0;
    }

    // prints the player name, score, and the name of every card in the player's hand
    public void describe()
    {
        System.out.println(name+" "+getScore());
        for (Card c : hand)
        {c.description();}
    }

    // instantiates a new hand
    public void setHand()
    {this.hand = new ArrayList<>();}

    public ArrayList<Card> getHand()
    {return this.hand;}

    // removes and returns the top card of the players hand
    public Card flip()
    {return hand.remove(0);}

    // draws (removes and returns top card of the deck) from the deck and adds the return to the player hand
    public void draw(Deck deck)
    {hand.add(deck.draw());}

    // adds one to the player score
    public void incrementScore()
    {this.score++;}

    // returns the player's name
    public String getPlayerName()
    {return name;}

    public void setPlayerName(String name)
    {this.name = name;}

    //returns the player's score
    public int getScore()
    {return score;}
}
