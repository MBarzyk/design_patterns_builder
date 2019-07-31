package design_pattern_singleton.example_v1;


// antywzorzec
public class ConfigFileManager {
    // wersja 1
    // eager - instancja tworzy sie przed pierwszym uzyciem (przy zaladowaniu klasy)
    // lazy - przy uzyciu - W TYM PRZYPADKU LAZY
    public static final ConfigFileManager INSTANCE = new ConfigFileManager();

    private ConfigFileManager() {
    }

    private void otworzPlik() {

    }

    private void zamknijPlik() {

    }

    public void wczytajPlik() {
        otworzPlik();
//        ...
        zamknijPlik();
    }

    public void zapiszPlik() {
        otworzPlik();
//        ...
        zamknijPlik();
    }
}
