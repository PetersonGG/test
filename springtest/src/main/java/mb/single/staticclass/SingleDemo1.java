package mb.single.staticclass;

public class SingleDemo1 {
    public static void main(String[] args) {
        Single4 instance1 = Single4.getInstance();
        Single4 instance2 = Single4.getInstance();
        System.out.println(instance1==instance2);

}


}

//静态内部类完成单例模式
class Single4 {

    private Single4() {

    }
    //写一个静态内部类，该内中有一个静态属性Single
    private static class SingletonInstance{

        private static final Single4 INSTANCE = new Single4();
    }
    //提供一个静态方法，直接放回SingletonInstance.INSTANCE
    public static Single4 getInstance() {

        return SingletonInstance.INSTANCE;
    }

}


