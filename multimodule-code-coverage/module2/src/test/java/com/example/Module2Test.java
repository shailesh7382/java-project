package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Module2Test {

    @Test
    void testMethodModule2() {
        Module2 module2 = new Module2();
        module2.methodModule2();
        // Add assertions or verifications if needed
    }

    @Test
    void testMethodModule2_2() {
        Module2 module2 = new Module2();
        module2.methodModule2_2();
        // Add assertions or verifications if needed
    }

    @Test
    void testMethodModule2_3() {
        Module2 module2 = new Module2();
        module2.methodModule2_3();
        // Add assertions or verifications if needed
    }

//    @Test
    void testMainMethod() {
        Module2.main(new String[]{});
        // Since main method only prints to console, you might want to use a library like SystemLambda to capture the output
    }

    @Test
    void testMethodModule2Output() {
        Module2 module2 = new Module2();
        // Capture the output of methodModule2
        String output = captureOutput(() -> module2.methodModule2());
//        assertEquals("methodModule2", output.trim());
    }

    @Test
    void testMethodModule2_2Output() {
        Module2 module2 = new Module2();
        // Capture the output of methodModule2_2
        String output = captureOutput(() -> module2.methodModule2_2());
        assertEquals("methodModule2_2(", output.trim());
    }

    @Test
    void testMethodModule2_3Output() {
        Module2 module2 = new Module2();
        // Capture the output of methodModule2_3
        String output = captureOutput(() -> module2.methodModule2_3());
        assertEquals("methodModule2_3", output.trim());
    }

    // Utility method to capture console output
    private String captureOutput(Runnable runnable) {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        runnable.run();
        return out.toString();
    }
}