package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Reznov
 * @Description:
 * @Date: 2022/6/22
 */
public class StringDemo {
    /**
     *
     */


    @Test
    public void indexOf(){
        //使用indexOf和lastIndexOf
        String str = "asdasga165f46897a";
        int index1 = str.indexOf(97);
        int startIndex = str.indexOf("a");
        //返回从第索引值5之后第一次出现a字符的索引
        int index = str.indexOf("a", 5);
        int lastIndexOf = str.lastIndexOf("a");
        System.out.println(index1);
        System.out.println("startIndex==="+startIndex);
        System.out.println("fromIndex==="+index);
        System.out.println("lastIndexOf==="+lastIndexOf);
    }

    @Test
    public void charAtString(){
        //charAt(int index)返回指定索引的字符
        String str = "asdasga16546897a";
        char at = str.charAt(8);
        System.out.println(at);
    }

    @Test
    public void subString2(){
        //subString 截取指定索引位置的字符串
        /*
        * subString(int index) 从index位子开始截取整个字符串
        * subString(int start,int end) 从start开始截取到end位置不包含end
        * */
        String str = "asdasga16546897a";
        String s = str.substring(2);
        String substring = str.substring(0, 7);
        System.out.println(s);
        System.out.println(substring);
    }

    @Test
    public void StringRePlace(){
        //replace(char oldChar,char newChar)将newChar字符替换掉oldChar字符
        String str = "asdasga16546897a";
        String replace = str.replace("a", "-");
        System.out.println(replace);

    }

    @Test
    public void length(){
        //length字符串的长度
        String str = "asdasga16546897a";
        int length = str.length();
        System.out.println(length);
    }

    @Test
    public void trim(){
        /*
        * trim() 去除字符前后的空字符串
        * */
        String str = " as da sga1654 6897a ";
        String trim = str.trim();
        int length = trim.length();
        String replace = trim.replace(" ", "-");
        String trimrep = replace.replace("-", "");
        System.out.println(length);
        System.out.println(trim);
        System.out.println(replace);
        System.out.println(trimrep);
    }
    @Test
    public void lengthStr(){
        //length字符串的长度
        String str = "asdasga16546897a";
        String LowerStr = str.toLowerCase();
        String UpperStr = str.toUpperCase();
        System.out.println(LowerStr);
        System.out.println(UpperStr);
    }

    @Test
    public void value(){
        String str = "asdasga16546897a";
        String s = String.valueOf(str.toCharArray(), 2, 5);
        System.out.println(str);
        System.out.println(s);
    }

    @Test
    public void with(){
        //startsWith("as")字符串是否以as开头
        String str = "asdasga16546897a";
        boolean flag = str.startsWith("as");
        System.out.println(flag);

    }

    @Test
    public void splitStr(){
        //split()将字符串进行拆分，split(" ")根据
        String str = "casdasga16546897ab";
        String[] strings = str.split("a");
        for (String string : strings) {
            System.out.println(string);
        }

    }


    @Test
    public void test(){
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

       /* Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(6);


        Iterator<Integer> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println("数据元素===="+iterator.next());
            if(list2.contains(iterator.next())){
                list.add(iterator.next());
            }
        }
        System.out.println(list);




    }

}
