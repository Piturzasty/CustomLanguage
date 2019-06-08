package com.custom.language;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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
    public void castTest() {
        try {
            Main.parseFile("/castExample.txt");
            assertEquals("Hello my dear\n8\n", outContent.toString());
            assertThrows(ClassCastException.class,()->Main.parseFile("/castExampleCastException.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleArithmeticTest() {
        try {
            Main.parseFile("/simpleArithmeticExample.txt");
            assertEquals("13\n13\n5\n2\n3\n", outContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void simpleBooleanOperationsTest() {
        try {
            Main.parseFile("/simpleBooleanOperationsExample.txt");
            assertEquals("true\nfalse\nfalse\ntrue\n", outContent.toString());
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