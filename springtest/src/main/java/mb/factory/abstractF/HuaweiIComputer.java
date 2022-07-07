package mb.factory.abstractF;

public class HuaweiIComputer implements IComputer {
    @Override
    public void start() {
        System.out.println("打开华为电脑");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为电脑");
    }
}
