package mb.factory.abstractF;

public class HuaweiIRouter implements IRouter {
    @Override
    public void open() {
        System.out.println("打开华为路由器");
    }

    @Override
    public void setter() {
        System.out.println("配置华为路由器");
    }

    @Override
    public void setPassword() {
        System.out.println("设置华为路由器密码");
    }
}
