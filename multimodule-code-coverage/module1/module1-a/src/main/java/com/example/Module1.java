package com.example;

public class Module1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    Module1() {
        System.out.println("Hello world!");
    }

    public void methodModule1() {
        System.out.println("Hello world!");
//        Module1C module1C = new Module1C();
        Module1C.main(null);
    }
    public void methodModule1_2() {
        System.out.println("Hello world!");
    }
    public void methodModule1_3() {
        System.out.println("Hello world!");
    }
}