package design_patern_abstract_factory.zad1;

public class AppleMac extends AbstractPC {

    public AppleMac(String name, int cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, ComputerBrand.APPLE, cpuPower, gpuPower, isOverclocked);
    }

    public static AppleMac createAir13() {
        return new AppleMac("Air 13", 10, 0.2, false);
    }

    public static AppleMac createMcBugPRO() {
        return new AppleMac("McBug PRO", 50, 10, true);
    }
}
