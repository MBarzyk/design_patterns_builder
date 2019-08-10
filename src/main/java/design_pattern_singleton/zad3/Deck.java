package design_pattern_singleton.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Cards> deckOfCards;

    public Deck() {
        deckOfCards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
           deckOfCards.addAll((Arrays.asList(Cards.DEUCE, Cards.THREE, Cards.FOUR, Cards.FIVE, Cards.SIX,
                    Cards.SEVEN, Cards.EIGHT, Cards.NINE, Cards.TEN, Cards.JACK, Cards.QUEEN, Cards.KING, Cards.ACE)));
        }
        Collections.shuffle(deckOfCards);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckOfCards=" + deckOfCards +
                '}';
    }

    public List<Cards> getDeckOfCards() {
        return deckOfCards;
    }
}
