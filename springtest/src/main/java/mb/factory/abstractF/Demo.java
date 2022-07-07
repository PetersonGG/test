package mb.factory.abstractF;

public class Demo {
    public static void main(String[] args) {

        IPhone IPhone = null;
        IRouter IRouter = null;
        IComputer Icomputer = null;

        System.out.println("========小米==========");
        XiaomiFactory xiaomifactory = new XiaomiFactory();
         IPhone = xiaomifactory.getPhone();
        IPhone.startPhone();
        IPhone.callPhone();
        IPhone.send();
        IPhone.shutdownPhone();

        IRouter = xiaomifactory.getRouter();
        IRouter.open();
        IRouter.setter();
        IRouter.setPassword();

        Icomputer = xiaomifactory.getComputer();
        Icomputer.start();
        Icomputer.shutdown();


        System.out.println("========华为==========");
        HuaweiFactory HuaweiFactory = new HuaweiFactory();
         IPhone = HuaweiFactory.getPhone();
        IPhone.startPhone();
        IPhone.callPhone();
        IPhone.send();
        IPhone.shutdownPhone();

        IRouter = HuaweiFactory.getRouter();
        IRouter.open();
        IRouter.setter();
        IRouter.setPassword();

        Icomputer = HuaweiFactory.getComputer();
        Icomputer.start();
        Icomputer.shutdown();
    }
}
