package com.yx.test.controller;

import java.util.Objects;

public class A {



    public void test(String a){
        String testa = testa(a);

        String xx = "xx";
        String s = testa + xx;
        if (s.equals("xx")) {
            System.out.println("c");
            System.out.println("D1");
            System.out.println("E2");
            System.out.println("A1");
            System.out.println("B1");
            System.out.println("xxxxx");
            return;
        }

        if (s.equals("ddd")){
            System.out.println(s);
        }
    }

    private String testa(String a) {

        String s = null;
        if (a.equals("xxxx")) {
            s = a + "xxes";
        }

        if (a.equals("dddd")){
            System.out.println("E2");
            System.out.println("D1");
            System.out.println("A1");
            System.out.println("B1");
            System.out.println("C1");
            s=a+"ddd";
        }
        if(Objects.isNull(s)){
            s=a;
        }

        return s;

    }
}
