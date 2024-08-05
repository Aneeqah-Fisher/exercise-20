import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CouponCollector {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        ArrayList<String> deck = new ArrayList<>();

        // Create a deck of 52 cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        int picks = 0;
        HashSet<String> pickedSuits = new HashSet<>();
        ArrayList<String> pickedCards = new ArrayList<>();

        while (pickedSuits.size() < 4) {
            Collections.shuffle(deck);
            String pickedCard = deck.get(0);
            pickedCards.add(pickedCard);
            pickedSuits.add(pickedCard.split(" of ")[1]);
            picks++;
        }

        System.out.println("Number of picks needed: " + picks);
        System.out.println("Cards picked: " + pickedCards);
    }
}
