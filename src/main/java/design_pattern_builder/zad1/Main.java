package design_pattern_builder.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GameCharacter char1 = new GameCharacter.Builder().setName("Janusz").setHealth(100).setMana(10).setNumberOfPoints(1).createGameCharacter();
        GameCharacter char2 = new GameCharacter.Builder().setName("Dżonson").setHealth(120).setMana(0).setNumberOfPoints(10).createGameCharacter();
        GameCharacter char3 = new GameCharacter.Builder().setName("Maria").setHealth(50).setMana(50).setNumberOfPoints(25).createGameCharacter();
        GameCharacter char4 = new GameCharacter.Builder().setName("Stewart").setHealth(100).setMana(2).setNumberOfPoints(5).createGameCharacter();
        GameCharacter char5 = new GameCharacter.Builder().setName("Cipeusz").setHealth(20).setMana(0).setNumberOfPoints(-10).createGameCharacter();
        GameCharacter char6 = new GameCharacter.Builder().setName("Zonk").setHealth(150).setMana(100).setNumberOfPoints(125).createGameCharacter();
        GameCharacter char7 = new GameCharacter.Builder().setName("Piotr").setNumberOfPoints(666).createGameCharacter();
        GameCharacter char8 = new GameCharacter.Builder().setName("Sołowiej").setHealth(96).createGameCharacter();

        List<GameCharacter> characterList = new ArrayList<>(Arrays.asList(char1, char2, char3, char4, char5, char6, char7, char8));

        characterList.forEach(System.out::println);
    }
}
