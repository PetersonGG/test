package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/7/6
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(3);

        List<Integer> collect = arr.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);
    }



}
