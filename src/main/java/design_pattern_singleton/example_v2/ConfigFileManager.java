package design_pattern_singleton.example_v2;


// antywzorzec
public class ConfigFileManager {
    // wersja 2
    // eager - instancja tworzy sie przed pierwszym uzyciem (przy zaladowaniu klasy)
    public static final ConfigFileManager INSTANCE = new ConfigFileManager();

    private ConfigFileManager() {
    }


    public static ConfigFileManager getInstance() {
        return INSTANCE;
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
