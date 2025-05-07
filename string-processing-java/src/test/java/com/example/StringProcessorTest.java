package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testRemoveConsecutiveChars() {
        StringProcessor processor = new StringProcessor();
        String input = "aabcccbbad";
        String expected = "d";
        assertEquals(expected, processor.removeConsecutiveChars(input));
    }

    @Test
    public void testReplaceConsecutiveChars() {
        StringProcessor processor = new StringProcessor();
        String input = "abcccbad";
        String expected = "d";
        assertEquals(expected, processor.replaceConsecutiveChars(input));
    }
}    