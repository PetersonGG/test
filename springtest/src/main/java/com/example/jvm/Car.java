package com.example.jvm;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/4
 */
public class Car {
    public static void main(String[] args) {

        /**
         * car1、car2、car3 是在栈里面
         * Car
         */

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());

        Class<? extends Car> class1 = car1.getClass();
//        Class<? extends Car> Class2 = car1.getClass();
//        Class<? extends Car> Class3 = car1.getClass();
//
//        System.out.println(Class1.hashCode());
//        System.out.println(Class2.hashCode());
//        System.out.println(Class3.hashCode());
        System.out.println(class1.getClassLoader());//AppClassLoader  应用类加载器
        System.out.println(class1.getClassLoader().getParent());//ExtClassLoader  扩展类加载器

    }
}
