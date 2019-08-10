package design_pattern_singleton.zad2;

public class Main {
    public static void main(String[] args) {
        FileLoader loader = new FileLoader();
        Game game = new Game();

        loader.configReader();

        game.playTheGame();

    }
}
