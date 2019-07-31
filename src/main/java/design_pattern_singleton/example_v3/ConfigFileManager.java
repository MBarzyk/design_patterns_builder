package design_pattern_singleton.example_v3;


// antywzorzec
public class ConfigFileManager {
    // wersja 3
    // lazy synchronized
    public static ConfigFileManager INSTANCE = new ConfigFileManager();

    private ConfigFileManager() {
    }

    public static ConfigFileManager getInstance() {
        if (INSTANCE == null) {
            synchronized (INSTANCE) {
                if (INSTANCE == null) {
                    INSTANCE = new ConfigFileManager();
                }
            }
        }
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
