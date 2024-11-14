package com.example;

public class Module1C {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        com.module3.Main.main(new String[]{});// This is a call to a method in another module
    }

    public void methodModule1_c() {
        System.out.println("methodModule1_c");
    }
    public void methodModule1_c2() {
        System.out.println("methodModule1_c2(");
    }
    public void methodModule1_c3() {
        System.out.println("methodModule1_c3");
    }
}