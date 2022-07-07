package mb.factory.abstractF;

public class XiaomiIRouter implements IRouter {
    @Override
    public void open() {
        System.out.println("打开小米路由器");
    }

    @Override
    public void setter() {
        System.out.println("配置小米路由器");
    }

    @Override
    public void setPassword() {
        System.out.println("设置小米路由器密码");
    }
}
