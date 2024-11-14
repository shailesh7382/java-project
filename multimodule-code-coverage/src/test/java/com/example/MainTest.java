package com.example;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;




    public class MainTest {

        @Test
        public void testMethodModulemain_2() {
            Main main = new Main();
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            main.methodModulemain_2();

            assertEquals("methodModulemain_2(\n", outContent.toString());
        }

        @Test
        public void testMethodModulemain() {
            Main main = new Main();
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            main.methodModulemain();

            assertEquals("methodModulemain\n", outContent.toString());
        }

        @Test
        public void testMethodModulemain_3() {
            Main main = new Main();
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));

            main.methodModulemain_3();

            assertEquals("methodModulemain_3\n", outContent.toString());
        }

        package com.example;


        public class MainTest {

            @Test
            public void testMainConstructor() {
                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outContent));

                new Main();

                assertEquals("Hello world!\n", outContent.toString());
            }

            @Test
            public void testMethodModule1() {
                Main main = new Main();
                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outContent));

                main.methodModule1();

                assertEquals("Hello world!\n", outContent.toString());
            }

            @Test
            public void testMethodModule1_2() {
                Main main = new Main();
                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outContent));

                main.methodModule1_2();

                assertEquals("Hello world!\n", outContent.toString());
            }

            @Test
            public void testMethodModule1_3() {
                Main main = new Main();
                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                System.setOut(new PrintStream(outContent));

                main.methodModule1_3();

                assertEquals("Hello world!\n", outContent.toString());
            }


        }
    }
