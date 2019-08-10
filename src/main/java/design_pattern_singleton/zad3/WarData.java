package design_pattern_singleton.zad3;

public enum WarData {
    INSTANCE;

    private int numberOfWars;
    private int numberOfWonWars;
    private int biggestWar;

    private WarData() {
    }

    WarData(int numberOfWars, int numberOfWonWars, int biggestWar) {
        this.numberOfWars = numberOfWars;
        this.numberOfWonWars = numberOfWonWars;
        this.biggestWar = biggestWar;
    }

    public int getNumberOfWars() {
        return numberOfWars;
    }

    public void setNumberOfWars(int numberOfWars) {
        this.numberOfWars = numberOfWars;
    }

    public int getNumberOfWonWars() {
        return numberOfWonWars;
    }

    public void setNumberOfWonWars(int numberOfWonWars) {
        this.numberOfWonWars = numberOfWonWars;
    }

    public int getBiggestWar() {
        return biggestWar;
    }

    public void setBiggestWar(int biggestWar) {
        this.biggestWar = biggestWar;
    }
}
