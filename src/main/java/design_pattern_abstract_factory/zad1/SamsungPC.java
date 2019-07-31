package design_pattern_abstract_factory.zad1;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, ComputerBrand.SAMSUNG, cpuPower, gpuPower, isOverclocked);
    }

    public static SamsungPC createSamsungCrap() {
        return new SamsungPC("SAMSUNG Crap", 20, 0.5, false);
    }

    public static SamsungPC createSamsungShit () {
        return new SamsungPC("SAMSUNG Shit", 80, 5, false);
    }
}
