package mb.single.lazy;

public class SingleDemo3 {
    public static void main(String[] args) {
        Single3 instance1 = Single3.getInstance();
        Single3 instance2 = Single3.getInstance();
        System.out.println(instance1==instance2);

}


}

class Single3 {

   private static Single3 instance;

   private Single3() {

   }

   //提供一个静态的公告方法，当使用到该方法，才去创建instance
   //即懒汉式不能用
   public static  Single3 getInstance() {
       if (instance == null) {
           synchronized(Single3.class){
               instance = new Single3();
           }
       }

       return instance;
   }

}


