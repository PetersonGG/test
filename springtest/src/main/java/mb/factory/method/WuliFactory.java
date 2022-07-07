package mb.factory.method;

public class WuliFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLin();
    }
}
