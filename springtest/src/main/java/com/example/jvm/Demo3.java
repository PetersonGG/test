package com.example.jvm;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/5
 */
public class Demo3 {
    private static int count = 1;
    public static void main(String[] args) {
        System.out.println(count);
        count++;
       main(args);
    }
}
