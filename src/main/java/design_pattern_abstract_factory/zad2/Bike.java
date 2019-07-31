package design_pattern_abstract_factory.zad2;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Bike {
    private String brand;
    private int derailleurs;
    private BikeType bikeType;
}
