import java.util.*;

public class CardGame_10 {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {

        // Shuffle the deck by swapping each card with a random card from the remaining
        // deck
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0]; // Return an empty array if not enough cards
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        // Distribute the cards to players
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < numCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Number of players and cards to distribute
        System.out.println("Enter the number of players");
        int numPlayers = input.nextInt();
        System.out.println("Enter the number of card each players get(1-13)");
        int numCards = input.nextInt();

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Distribute the cards to players
        String[][] players = distributeCards(deck, numPlayers, numCards);

        // Print the players' cards
        printPlayersCards(players);

        input.close();
    }
}