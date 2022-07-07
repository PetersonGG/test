package mb.factory.simple;

public class Demo {
    public static void main(String[] args) {
        Car wuli = CarFactory.getCar("五菱");
        wuli.name();
    }
}
