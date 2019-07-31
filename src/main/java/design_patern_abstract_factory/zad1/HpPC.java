package design_patern_abstract_factory.zad1;

public class HpPC extends AbstractPC {
    public HpPC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, ComputerBrand.HP, cpuPower, gpuPower, isOverclocked);
    }

    public static HpPC createHp100 () {
        return new HpPC("HP 100", 100, 10, false);
    }

    public static HpPC crateHp1000 () {
        return new HpPC("HP 1000", 250, 25, true);
    }
}
