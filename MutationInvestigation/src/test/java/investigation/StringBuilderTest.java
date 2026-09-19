package test.java.investigation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * String is used to hold a defined, constant series of characters, not meant to be changed
 * StringBuilder is used to hold a mutable series of characters that can be changed in different ways
 * One place to use String over StringBuilder is in storing names
 * Names almost never change, so they can be stored in a constant String variable
 */

/**
 * Investigates whether StringBuilder methods change the object they are called on.
 */
public class StringBuilderTest
{
    @Test
    public void lengthReturnsTheLengthOfTheStringAndLeavesTheOriginalAlone() {
        StringBuilder sb = new StringBuilder("Mississippi");
        int length = sb.length();

        assertEquals(length, sb.length());
        assertEquals("Mississippi", sb.toString());   // original stayed the same
    }

    @Test
    public void appendAddsToTheOriginalString() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World");

        assertEquals("Hello, World", sb.toString());   // original changed
    }

    @Test
    public void insertChangesTheOriginalString() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(0, "Oh, ");

        assertEquals("Oh, Hello", sb.toString());   // original changed
    }

    @Test
    public void reverseFlipsTheOriginalString() {
        StringBuilder sb = new StringBuilder("desserts");
        sb.reverse();

        assertEquals("stressed", sb.toString());   // original changed
    }

    @Test
    public void toStringReturnsTheOriginalString() {
        StringBuilder sb = new StringBuilder("Hello");
        assertEquals("Hello", sb.toString());   // original stayed the same
    }

    // WARNING: assertEquals compares objects. A StringBuilder is not a String
    // even when the characters match. Work out what you need to do about that.
}
