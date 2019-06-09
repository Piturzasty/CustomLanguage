package com.custom.language;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void printStringTest() {
        try {
            Main.parseFile("/printSimpleStringExample.txt");
            assertEquals("Hello my dear", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void printVariablesTest() {
        try {
            Main.parseFile("/printVariableExample.txt");
            assertEquals("Hello my dear Fren", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void printVariablesNewLineTest() {
        try {
            Main.parseFile("/printVariableNewLineExample.txt");
            assertEquals("Hello my dear\n8\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticAddTest() {
        try {
            Main.parseFile("/simpleArithmeticAddExample.txt");
            assertEquals("13.0\n13.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticSubTest() {
        try {
            Main.parseFile("/simpleArithmeticSubExample.txt");
            assertEquals("3.0\n5.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticDivTest() {
        try {
            Main.parseFile("/simpleArithmeticDivExample.txt");
            assertEquals("2.0\n2.0\n2.6666666666666665\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticMulTest() {
        try {
            Main.parseFile("/simpleArithmeticMulExample.txt");
            assertEquals("40.0\n40.0\n24.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticModTest() {
        try {
            Main.parseFile("/simpleArithmeticModExample.txt");
            assertEquals("3.0\n3.0\n2.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleBooleanNotTest() {
        try {
            Main.parseFile("/simpleBooleanNotExample.txt");
            assertEquals("true\nfalse\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleBooleanAndTest() {
        try {
            Main.parseFile("/simpleBooleanAndExample.txt");
            assertEquals("true\nfalse\nfalse\nfalse\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleBooleanOrTest() {
        try {
            Main.parseFile("/simpleBooleanOrExample.txt");
            assertEquals("true\nfalse\ntrue\ntrue\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleLessThanComparatorTest() {
        try {
            Main.parseFile("/simpleLessThanExample.txt");
            assertEquals("true\nfalse\nfalse\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleLessEqualsComparatorTest() {
        try {
            Main.parseFile("/simpleLessEqualsExample.txt");
            assertEquals("true\ntrue\nfalse\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleGreaterThanComparatorTest() {
        try {
            Main.parseFile("/simpleGreaterThanExample.txt");
            assertEquals("false\nfalse\ntrue\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleGreaterEqualsComparatorTest() {
        try {
            Main.parseFile("/simpleGreaterEqualsExample.txt");
            assertEquals("false\ntrue\ntrue\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleForLoopTest() {
        try {
            Main.parseFile("/simpleForLoopExample.txt");
            assertEquals("0\n1.0\n2.0\n3.0\n4.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleIncrementTest() {
        try {
            Main.parseFile("/simpleIncrementExample.txt");
            assertEquals("6.0\n3.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleDecrementTest() {
        try {
            Main.parseFile("/simpleDecrementExample.txt");
            assertEquals("4.0\n1.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleDoWhileLoopTest() {
        try {
            Main.parseFile("/simpleDoWhileExample.txt");
            assertEquals("1.0\n2.0\n3.0\n4.0\n5.0\n6.0\n7.0\n8.0\n9.0\n10.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleWhileLoopTest() {
        try {
            Main.parseFile("/simpleWhileExample.txt");
            assertEquals("1.0\n2.0\n3.0\n4.0\n5.0\n6.0\n7.0\n8.0\n9.0\n10.0\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}