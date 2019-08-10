package design_pattern_singleton.zad3;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Cards> playersCards;

    public Player(String name) {
        this.name = name;
        this.playersCards = new ArrayList<>();
    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cards> getPlayersCards() {
        return playersCards;
    }

    public void setPlayersCards(List<Cards> playersCards) {
        this.playersCards = playersCards;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playersCards=" + playersCards +
                '}';
    }
}
