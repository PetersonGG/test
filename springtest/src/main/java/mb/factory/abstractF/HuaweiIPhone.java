package mb.factory.abstractF;

public class HuaweiIPhone implements IPhone {

    @Override
    public void startPhone() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdownPhone() {
        System.out.println("华为手机关机");
    }

    @Override
    public void send() {
        System.out.println("华为手机发短信");
    }

    @Override
    public void callPhone() {
        System.out.println("华为手机打电话");
    }
}
