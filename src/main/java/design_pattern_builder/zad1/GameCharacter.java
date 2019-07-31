package design_pattern_builder.zad1;

import lombok.ToString;

@ToString
public class GameCharacter {
    private String name;
    private long health, mana, numberOfPoints;

    public GameCharacter(String name, long health, long mana, long numberOfPoints) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.numberOfPoints = numberOfPoints;
    }

    public static class Builder {

        private String name;
        private long health;
        private long mana;
        private long numberOfPoints;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHealth(long health) {
            this.health = health;
            return this;
        }

        public Builder setMana(long mana) {
            this.mana = mana;
            return this;
        }

        public Builder setNumberOfPoints(long numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter createGameCharacter() {
            return new GameCharacter(name, health, mana, numberOfPoints);
        }
    }
}
