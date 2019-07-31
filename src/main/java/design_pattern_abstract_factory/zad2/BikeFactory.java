package design_pattern_abstract_factory.zad2;

public abstract class BikeFactory {
    public static Bike createKross () {
        return new Bike("Kross", 5, BikeType.BICYCLE);
    }
    public static Bike createMerida () {
        return new Bike("Merida", 6, BikeType.BICYCLE);
    }
    public static Bike createIniana () {
        return new Bike("Iniana", 3, BikeType.TANDEM);
    }
    public static Bike createFelt () {
        return new Bike("Felt", 6, BikeType.BICYCLE);
    }
    public static Bike createGoetze () {
        return new Bike("Goetze", 1, BikeType.TANDEM);
    }
}
