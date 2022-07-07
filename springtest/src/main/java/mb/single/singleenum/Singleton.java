package mb.single.singleenum;

public class Singleton {
    public static void main(String[] args) {
        Single instance1 = Single.INSTANCE;
        Single instance2 = Single.INSTANCE;

        System.out.println(instance1==instance2);
    }
}


//使用枚举可以创建单例模式
enum Single{

    INSTANCE; //属性
    public void sayOk(){
        System.out.println("ok");
    }
}
