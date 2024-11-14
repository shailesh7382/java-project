package com.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainTest {
    @Test
    public void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main.main(null);
        assertEquals("Hello world!\n", outContent.toString());
    }
    @Test
    public void testMethodModulemain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main main = new Main();
        main.methodModulemain();
        assertEquals("Hello world!\nmethodModulemain\n", outContent.toString());
    }
    @Test
    public void testMethodModulemain_2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main main = new Main();
        main.methodModulemain_2();
        assertEquals("methodModulemain_2(\n", outContent.toString());
    }
    @Test
    public void testMethodModulemain_3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Main main = new Main();
        main.methodModulemain_3();
        assertEquals("methodModulemain_3\n", outContent.toString());
    }
}