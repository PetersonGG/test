package com.example.jvm;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/4
 */
public class Demo01 {

    public static void main(String[] args) {
        //返回虚拟机视图使用最大的
        long max = Runtime.getRuntime().maxMemory();//3561.0MB

        //返回jvm的初始化内存
        long total = Runtime.getRuntime().totalMemory();//241.5MB

        System.out.println("max="+max+"字节\t"+(max/(double)1024/1024)+"MB");
        System.out.println("total="+total+"字节\t"+(total/(double)1024/1024)+"MB");

    }
}
