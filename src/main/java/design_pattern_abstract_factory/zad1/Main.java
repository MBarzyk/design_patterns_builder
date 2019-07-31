package design_pattern_abstract_factory.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AbstractPC mac = AppleMac.createAir13();
        AbstractPC macPro = AppleMac.createMcBugPRO();

        AbstractPC crap = SamsungPC.createSamsungCrap();
        AbstractPC shit = SamsungPC.createSamsungShit();

        AbstractPC hp100 = HpPC.createHp100();
        AbstractPC hp1000 = HpPC.crateHp1000();

        AbstractPC krasus = AsusPC.createAsusKrasus();
        AbstractPC protasus = AsusPC.createAsusProtasus();



        List<AbstractPC> pcList = new ArrayList<>(Arrays.asList(mac, macPro, crap, shit, hp100, hp100, krasus, protasus
        , ComputerFactory.createMacBookPro(), ComputerFactory.createHpPro()));

        pcList.forEach(System.out::println);
    }
}
