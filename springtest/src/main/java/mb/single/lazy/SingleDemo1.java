package mb.single.lazy;

public class SingleDemo1 {
    public static void main(String[] args) {
        Single1 instance1 = Single1.getInstance();
        Single1 instance2 = Single1.getInstance();
        System.out.println(instance1==instance2);

    }

}

class Single1 {

    private static Single1 instance;

    private Single1() {

    }

    //提供一个静态的公告方法，当使用到该方法，才去创建instance
    //即懒汉式不安全
    public static Single1 getInstance() {
        if (instance == null) {
            instance = new Single1();
        }

        return instance;
    }


}


