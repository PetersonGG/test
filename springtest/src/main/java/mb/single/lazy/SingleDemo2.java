package mb.single.lazy;

public class SingleDemo2 {
    public static void main(String[] args) {
        Single2 instance1 = Single2.getInstance();
        Single2 instance2 = Single2.getInstance();
        System.out.println(instance1==instance2);

    }


}

class Single2 {
    private static Single2 instance;
    private Single2() {
    }
    //提供一个静态的公告方法，当使用到该方法，才去创建instance
    //即懒汉式不推荐效率低
    public static synchronized Single2 getInstance() {
        if (instance == null) {
            instance = new Single2();
        }

        return instance;
    }

}


