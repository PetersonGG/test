package mb.single.lazy;

public class SingleDemo4 {
    public static void main(String[] args) {
        Single instance1 = Single.getInstance();
        Single instance2 = Single.getInstance();
        System.out.println(instance1==instance2);

}

static class Single {

    private static volatile Single instance;

    private Single() {

    }

    //提供一个静态的公告方法，加入双重检查锁，解决线程安全问题
    //即懒汉式推荐使用
    public static synchronized Single getInstance() {
        if (instance == null) {
            synchronized(Single.class){
                if (instance == null) {
                    instance = new Single();
                }
            }
        }

        return instance;
    }

    }
}


