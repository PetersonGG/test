package mb.jvm;

public class JvmDemo {
    public static void main(String[] args) {


        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("maxMemory = "+maxMemory+ " 字节 "+(maxMemory/(double)1024/1024)+"MB");
        System.out.println("totalMemory = "+totalMemory+ " 字节 "+(totalMemory/(double)1024/1024)+"MB");



    }
}
