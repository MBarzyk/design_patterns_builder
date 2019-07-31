package design_pattern_abstract_factory.zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Bike> bikeList = new ArrayList<>(Arrays.asList(
                BikeFactory.createKross(),
                BikeFactory.createFelt(),
                BikeFactory.createGoetze(),
                BikeFactory.createMerida(),
                BikeFactory.createIniana()
        ));

        bikeList.forEach(System.out::println);
    }
}
