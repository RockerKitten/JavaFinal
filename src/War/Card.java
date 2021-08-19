package War;

public class Card {
    private static int value;
    private static StringBuilder name;
    private static String suit;
    public Card(int value, String suit)
    {
        Card.value = value;
        Card.suit = suit;
        Card.setName();
    }

private static void setName() {
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
    Card.name = name;
    }
    public static void setValue(int value)
    {
        Card.value = value;
    }
    public static void setSuit(String suit)
    {
        Card.suit = suit;
    }

    public static StringBuilder getName()
    {return name;}

    public static int getValue()
    {return value;}

    public static void description()
    {
        System.out.println(Card.getName());
    }
}
