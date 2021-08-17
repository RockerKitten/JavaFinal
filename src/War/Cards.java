package War;

public abstract class Cards {
    private static int value;
    private static StringBuilder name;
    private static int suit;

public Cards(int value, StringBuilder name, int suit)
{
    Cards.value = value;
    Cards.name = new StringBuilder(name);
    Cards.suit = suit;
}
    public static StringBuilder getName(int value, int suit) {
    Cards.name = new StringBuilder(name);
    if (value >=1 && value <11)
    {name.append(value);}
    else if (value==11)
    {
        name.append("Jack");
    }
    else if (value==12)
    {
        name.append("Queen");
    }
    else if (value==13)
    {
        name.append("King");
    }
    else if (value==14)
    {
        name.append("Ace");
    }

    if (suit ==1)
    {name.append(" of Hearts");}
    else if (suit ==2)
    {name.append(" of Diamonds");}
    else if (suit ==3)
    {name.append(" of Spades");}
    else if (suit ==4)
    {name.append(" of Clubs");}
        return name;
    }


    public static int getValue() {
        return value;
    }

    public static void setValue(int value) {
        Cards.value = value;
    }

    public static int getSuit() {
        return suit;
    }

    public static void setSuit(int suit) {
        Cards.suit = suit;
    }
}
