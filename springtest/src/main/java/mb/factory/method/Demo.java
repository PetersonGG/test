package mb.factory.method;

public class Demo {
    public static void main(String[] args) {
        Car car = new WuliFactory().getCar();
        Car car1 = new BaoMaFactory().getCar();
        car.name();
        car1.name();
    }
}
