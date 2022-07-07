package mb.factory.abstractF;

public class HuaweiFactory implements SuperFactory {
    @Override
    public IPhone getPhone() {
        return new HuaweiIPhone() ;
    }

    @Override
    public IRouter getRouter() {
        return new HuaweiIRouter();
    }

    @Override
    public IComputer getComputer() {
        return new HuaweiIComputer();
    }
}
