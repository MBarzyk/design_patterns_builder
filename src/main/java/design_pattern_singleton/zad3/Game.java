package design_pattern_singleton.zad3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Deck deck = new Deck();
    private Player player_1 = new Player();
    private Player player_2 = new Player();
    private List<Cards> cardStack = new ArrayList<>();


    public void letsPlayWar() {
        initializeGame();
        while (!player_1.getPlayersCards().isEmpty() || !player_2.getPlayersCards().isEmpty()) {
            playRound();
        }

        System.out.println(player_1.getPlayersCards().size());
        System.out.println(player_2.getPlayersCards().size());
    }


    private void initializeGame() {
        System.out.println("Welcome to the game of WAR!");
        System.out.println("Enter the name of first player: ");
        player_1.setName(scanner.nextLine());
        System.out.println("Enter the name of second player: ");
        player_2.setName(scanner.nextLine());
        giveCards();
        System.out.println("Good luck!");

        System.out.println(player_1.getPlayersCards().toString());
        System.out.println(player_2.getPlayersCards().toString());
    }

    public Game() {
    }

    private void giveCards() {
        List<Cards> cards1 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            cards1.add(deck.getDeckOfCards().get(i));
        }
        player_1.setPlayersCards(cards1);
        List<Cards> cards2 = new ArrayList<>();
        for (int i = 26; i < 52; i++) {
            cards2.add(deck.getDeckOfCards().get(i));
        }
        player_1.setPlayersCards(cards1);
        player_2.setPlayersCards(cards2);
    }

    private void playRound() {
        List<Cards> player_1_cards = new ArrayList<>(player_1.getPlayersCards());
        List<Cards> player_2_cards = new ArrayList<>(player_2.getPlayersCards());

        int result = Integer.compare(player_1_cards.get(0).getValue(), player_2_cards.get(0).getValue());

        if (result == 1) {
            cardStack.addAll(Arrays.asList(player_1_cards.get(0), player_2_cards.get(0)));
            player_1_cards.addAll(cardStack);
            player_1_cards.remove(0);
            player_1.setPlayersCards(player_1_cards);
            player_2_cards.remove(0);
            player_2.setPlayersCards(player_2_cards);
            cardStack.clear();
        }
        if (result == -1) {
            cardStack.addAll(Arrays.asList(player_1_cards.get(0), player_2_cards.get(0)));
            player_2_cards.addAll(cardStack);
            player_2_cards.remove(0);
            player_2.setPlayersCards(player_2_cards);
            player_1_cards.remove(0);
            player_1.setPlayersCards(player_1_cards);
            cardStack.clear();
        }

        if (result == 0) {
            cardStack.addAll(Arrays.asList(player_1_cards.get(0), player_2_cards.get(0)));
            player_1_cards.remove(0);
            player_1.setPlayersCards(player_1_cards);
            player_2_cards.remove(0);
            player_2.setPlayersCards(player_2_cards);
        }
    }
}
