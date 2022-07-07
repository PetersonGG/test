package mb.test;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        for (int i=1 ;i<=20;i++){
            map.put("第"+i+"数",i);
        }
        System.out.println(map.size());
        System.out.println(map);


    }


}

class A{
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}
