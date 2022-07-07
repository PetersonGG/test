package mb.factory.abstractF;

public class XiaomiIComputer implements IComputer {

    @Override
    public void start() {
        System.out.println("打开小米电脑");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米电脑");
    }
}
