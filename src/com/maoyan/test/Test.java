package com.maoyan.test;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String str = "this is a test";
        Arrays.asList(str.split(" ")).forEach(e -> System.out.println(Test.changeToUpper(e)));
    }

    private static String changeToUpper(String str){
        str = str+"#end";
        return str.toUpperCase();
    }
}