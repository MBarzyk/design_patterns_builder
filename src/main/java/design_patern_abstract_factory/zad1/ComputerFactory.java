package design_patern_abstract_factory.zad1;

public abstract class ComputerFactory {
    public static AbstractPC createMacBookPro () {
        return new AppleMac("Mac Book PRO", 10, 10, false);
    }

    public static HpPC createHpPro() {
        return new HpPC("HP Pro PC", 3000, 6000, true);
    }
}
