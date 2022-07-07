package mb.factory.abstractF;

public class XiaomiFactory implements SuperFactory {
    @Override
    public IPhone getPhone() {
        return new XiaomiIPhone();
    }

    @Override
    public IRouter getRouter() {
        return new XiaomiIRouter();
    }

    @Override
    public IComputer getComputer() {
        return new XiaomiIComputer();
    }
}
