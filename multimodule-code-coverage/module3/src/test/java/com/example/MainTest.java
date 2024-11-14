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

                    Main.main(new String[]{});

                    assertEquals("Hello world!\n", outContent.toString());
                }

                @Test
                public void testMethodModule2() {
                    Main main = new Main();
                    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outContent));

                    main.methodModule2();

                    assertEquals("methodModule3\n", outContent.toString());
                }

                @Test
                public void testMethodModule2_2() {
                    Main main = new Main();
                    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outContent));

                    main.methodModule2_2();

                    assertEquals("methodModule3_2(\n", outContent.toString());
                }

                @Test
                public void testMethodModule2_3() {
                    Main main = new Main();
                    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                    System.setOut(new PrintStream(outContent));

                    main.methodModule2_3();

                    assertEquals("methodModule3_3\n", outContent.toString());
                }
            }


    
    
