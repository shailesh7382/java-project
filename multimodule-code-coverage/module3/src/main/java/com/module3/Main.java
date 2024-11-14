package com.module3;

import com.example.Module2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public void methodModule2() {
        System.out.println("methodModule3");
        Module2.main(new String[]{});// This is a call to a method in another module
    }
    public void methodModule2_2() {
        System.out.println("methodModule3_2(");
    }
    public void methodModule2_3() {
        System.out.println("methodModule3_3");
    }
}