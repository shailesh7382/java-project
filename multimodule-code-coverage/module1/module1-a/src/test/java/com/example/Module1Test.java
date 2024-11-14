
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



class Module1Test {

    @Test
    void testMain() {
        // Since main method prints to console, we can redirect the output stream to test it
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Module1.main(new String[]{});
        assertEquals("Hello world!\n", outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    void testConstructor() {
        // Redirect the output stream to test constructor
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        new Module1();
        assertEquals("Hello world!\n", outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    void testMethodModule1() {
        // Redirect the output stream to test methodModule1
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Module1 module1 = new Module1();
        module1.methodModule1();
//        assertEquals("Hello world!\nHello world!\n", outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    void testMethodModule1_2() {
        // Redirect the output stream to test methodModule1_2
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Module1 module1 = new Module1();
        module1.methodModule1_2();
        assertEquals("Hello world!\nHello world!\n", outContent.toString());

        System.setOut(originalOut);
    }

    @Test
    void testMethodModule1_3() {
        // Redirect the output stream to test methodModule1_3
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Module1 module1 = new Module1();
        module1.methodModule1_3();
        assertEquals("Hello world!\nHello world!\n", outContent.toString());

        System.setOut(originalOut);
    }
}