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
            assertEquals("Hello my dear8", outContent.toString());
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