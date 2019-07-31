package design_pattern_singleton.zad2;

public enum MySettings {
    INSTANCE;

    private int startRange;
    private int endRange;
    private String signs;
    private int rounds;

    private MySettings() {
    }

    MySettings(int startRange, int endRange, String signs, int rounds) {
        this.startRange = startRange;
        this.endRange = endRange;
        this.signs = signs;
        this.rounds = rounds;
    }

    public int getStartRange() {
        return startRange;
    }

    public void setStartRange(int startRange) {
        this.startRange = startRange;
    }

    public int getEndRange() {
        return endRange;
    }

    public void setEndRange(int endRange) {
        this.endRange = endRange;
    }

    public String getSigns() {
        return signs;
    }

    public void setSigns(String signs) {
        this.signs = signs;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
