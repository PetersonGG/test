package com.example.jvm;

import java.util.ArrayList;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/4
 */
public class Demo02 {
    byte[] array = new byte[1*1024*1024];

    public static void main(String[] args) {
        ArrayList<Demo02> list = new ArrayList<>();
        int count =0;

        while (true){
            try {
                list.add(new Demo02());
                count = count+1;
            }catch (Error e){
                System.out.println("count"+count);
                e.printStackTrace();
            }
        }
    }
}
