package War;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck(); //instantiate deck
        Player player1 = new Player("Jim"); //instantiate new players
        Player player2 = new Player("Julie");
        deck.shuffle(); //shuffle deck

        // take shuffled deck and deal out to the players
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0)
                player1.draw(deck);
            else
                player2.draw(deck);
        }
//        player1.describe();
//        player2.describe();

        //flip and compare the card values
        for (int i = 0; i < 26; i++) {
            Card c = player1.flip();
            //c.description();
            Card d = player2.flip();
            //d.description();

            if (c.getValue() > d.getValue())  //increase the score of the player with the higher value
            {player1.incrementScore();}
            else if (d.getValue() > c.getValue())
            {player2.incrementScore();}
        }

        // compare scores display who wins
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1: " + player1.getPlayerName() + " Wins with a final score of " + player1.getScore());
            System.out.println("Player 2: " + player2.getPlayerName() + " had a final score of " + player2.getScore());
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println("Player 2: " + player2.getPlayerName() + " Wins with a final score of " + player2.getScore());
            System.out.println("Player 1: " + player1.getPlayerName() + " had a final score of " + player1.getScore());
        } else {
            System.out.println("Player 1: " + player1.getPlayerName() + ", with a score of " + player1.getScore() + " and Player 2: " + player2.getPlayerName() + ", with a score of " + player2.getScore() + " ended the game in a Draw");
        }
    }
}
