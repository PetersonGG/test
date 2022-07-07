package pojo;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/6/7
 */
public class Sun extends Father {
    @Override
    public void tall() {
        System.out.println("子类的tall");
    }

    @Override
    protected void hello() {
        System.out.println("子类的hello");
    }

    @Override
    void sleep() {
        System.out.println("子类的sleep");
    }
}
