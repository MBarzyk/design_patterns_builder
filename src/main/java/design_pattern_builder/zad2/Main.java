package design_pattern_builder.zad2;

public class Main {
    public static void main(String[] args) {
        Stamp stamp1 = new Stamp.Builder().setFirstDayNumber(2).setSecondDayNumber(3).setFirstMonthNumber(0).setSecondMonthNumber(7)
                .setYearNumber1(2).setYearNumber2(0).setYearNumber3(1).setYearNumber4(9).createStamp();


        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
        System.out.println(stamp1.toString());
    }
}
