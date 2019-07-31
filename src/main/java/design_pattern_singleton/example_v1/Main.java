package design_pattern_singleton.example_v1;

public class Main {
    public static void main(String[] args) {
//         LAZY
        ConfigFileManager.INSTANCE.wczytajPlik();
        ConfigFileManager.INSTANCE.zapiszPlik();
    }
}
