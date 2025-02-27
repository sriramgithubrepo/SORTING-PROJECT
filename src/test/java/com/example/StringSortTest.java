package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSortTest {

    @Test
    public void testCustomStringSort_NumbersAndLetters() {
        String result = StringSort.customStringSort("A11a4");
        assertEquals("411aA", result);
    }

    @Test
    public void testCustomStringSort_ComplexInput() {
        String result = StringSort.customStringSort("A121a4b@23!");
        assertEquals("423121abA!@", result);
    }

    @Test
    public void testCustomStringSort_OnlyLowerCase() {
        String result = StringSort.customStringSort("abcde");
        assertEquals("abcde", result);
    }

    @Test
    public void testCustomStringSort_OnlyUpperCase() {
        String result = StringSort.customStringSort("ABCDE");
        assertEquals("ABCDE", result);
    }

    @Test
    public void testCustomStringSort_OnlyDigits() {
        String result = StringSort.customStringSort("9876543210");
        assertEquals("9876543210", result);
    }

    @Test
    public void testCustomStringSort_EmptyString() {
        String result = StringSort.customStringSort("");
        assertEquals("", result);
    }

    @Test
    public void testCustomStringSort_OnlySpecialCharacters() {
        String result = StringSort.customStringSort("!@#$%^&*()");
        assertEquals("!#$%&()*@^", result);
    }
}