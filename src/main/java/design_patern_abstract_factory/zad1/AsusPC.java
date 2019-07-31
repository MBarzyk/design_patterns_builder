package design_patern_abstract_factory.zad1;

public class AsusPC extends AbstractPC {
    public AsusPC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, ComputerBrand.ASUS, cpuPower, gpuPower, isOverclocked);
    }

    public static AsusPC createAsusKrasus() {
        return new AsusPC("ASUS Krasus", 100, 5, true);
    }

    public static AsusPC createAsusProtasus () {
        return new AsusPC("ASUS Protasus", 300, 10, true);
    }
}
