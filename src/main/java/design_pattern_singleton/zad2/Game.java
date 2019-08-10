package design_pattern_singleton.zad2;

import java.util.Scanner;

public class Game {
    private final Scanner scanner = new Scanner(System.in);
    private int roundCounter;

    public Game() {
    }

    public Game(int roundCounter) {
        this.roundCounter = 0;
    }

    public void playTheGame() {
        System.out.println("Welcome to the game!\n" + "Solve as many problems as you can!");
        int correctCounter = 0;
        do {
            Round round = new Round();
            Integer answer = null;
            System.out.println("What is the result of: " + round.getStart() + " " + round.getSign() + " " + round.getEnd() + " ?");
            while (answer == null) {
                try {
                    answer = Integer.parseInt(scanner.nextLine());
                } catch (IllegalArgumentException e) {
                    System.err.println("Wrong input! Give a total number!");
                }
            }

            if (round.validate(answer)) {
                correctCounter++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }

            setRoundCounter(getRoundCounter() + 1);

        } while (roundCounter != MySettings.INSTANCE.getRounds());

        System.out.println("Your score is: " + correctCounter + "/" + MySettings.INSTANCE.getRounds());
    }

    public int getRoundCounter() {
        return roundCounter;
    }

    public void setRoundCounter(int roundCounter) {
        this.roundCounter = roundCounter;
    }
}
