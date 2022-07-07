package mb.single.hungry;

public class SingleDemo1 {
    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1==instance2);

        Singleton2 instance12 = Singleton2.getInstance();
        Singleton2 instance22 = Singleton2.getInstance();
        System.out.println(instance12==instance22);
    }


}

//饿汉式（静态变量）
class Singleton1{
    //1.构造器私有化
    private Singleton1(){

    }
    //2.本类内部创建对象实例
    private final static Singleton1 instance = new Singleton1();

    //3.提供一个静态方法，返回实例对象
    public static Singleton1 getInstance(){
        return instance;
    }

}

//饿汉式（静态代码块）
class Singleton2{
    //1.构造器私有化
    private Singleton2(){

    }

    private  static Singleton2 instance ;


    static {
        instance = new Singleton2();
    }

    //3.提供一个静态方法，返回实例对象
    public static Singleton2 getInstance(){
        return instance;
    }

}
