package War;

public class Card {
    private int value;
    private StringBuilder name;
    private String suit;

    // defines a card
    public Card(int value, String suit)
    {
        this.value = value;
        this.suit = suit;
        setName();
    }

    // sets the displayed name of a card, given the value and suit
public void setName() {
        int value = this.value;
        String suit = this.suit;
    StringBuilder name = new StringBuilder();
    if (value >1 && value <11)
    {name.append(value);}
    else if (value ==11)
    {name.append("Jack");}
    else if (value ==12)
    {name.append("Queen");}
    else if (value ==13)
    {name.append("King");}
    else if (value ==14)
    {name.append("Ace");}

    name.append(" of ").append(suit);
    this.name = name;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
    public void setSuit(String suit)
    {
        this.suit = suit;
    }

    // returns the name of a card
    public StringBuilder getName()
    {return this.name;}

    // returns the value of a card
    public int getValue()
    {return this.value;}

    // prints the name of a card
    public void description()
    {System.out.print(this.name);}
}
