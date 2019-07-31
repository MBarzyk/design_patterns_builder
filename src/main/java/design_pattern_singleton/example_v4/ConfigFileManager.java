package design_pattern_singleton.example_v4;


// antywzorzec
public enum ConfigFileManager {
    // wersja 4
    // eager - enumy się ładują szybciej blabla
    INSTANCE;

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
