package test.java.investigation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Investigates whether String methods change the string they are called on.
 */
public class StringTest
{
    /**
     * Proves that toUpperCase returns a new string and does not change the original.
     */
    @Test
    public void toUpperCaseReturnsANewStringAndLeavesTheOriginalAlone()
    {
        String river = "Mississippi";
        String shouted = river.toUpperCase();

        assertEquals("MISSISSIPPI", shouted);   // what came back
        assertEquals("Mississippi", river);     // what happened to the original
    }

    /**
     * Proves that length returns the length of the string without changing it.
     */
    @Test
    public void lengthReturnsTheLengthOfTheString() {
        String river = "Mississippi";
        int trueLength = 11;

        assertEquals(trueLength, river.length());
    }

    /**
     * Proves that replace returns a new string and does not change the original.
     */
    @Test
    public void replaceReturnsTheNewStringAndLeavesTheOriginalAlone() {
        String river = "Mississippi";
        String replaced = river.replace("ss", "SS");

        assertEquals("MiSSiSSippi", replaced);  // what came back
        assertEquals("Mississippi", river);     // what happened to the original
    }

    /**
     * Proves that trim returns a new string and does not change the original.
     */
    @Test
    public void trimReturnsTheNewStringAndLeavesTheOriginalAlone() {
        String helloSpaced = "  Hello, Space !  ";
        String trimmed = helloSpaced.trim();

        assertEquals("Hello, Space !", trimmed);
        assertEquals("  Hello, Space !  ", helloSpaced);
    }

    /**
     * Proves that concat returns a new string and does not change the original.
     */
    @Test
    public void concatReturnsTheNewStringAndLeavesTheOriginalAlone() {
        String hello = "Hello";
        String concatenated = hello.concat(", World!");

        assertEquals("Hello, World!", concatenated);
        assertEquals("Hello", hello);
    }

    /**
     * Proves that substring returns a new string and does not change the original.
     */
    @Test
    public void substringReturnsTheNewStringAndLeavesTheOriginalAlone() {
        String river = "Mississippi";
        String smallRiver = river.substring(0, 4);

        assertEquals("Miss", smallRiver);
        assertEquals("Mississippi", river);
    }
}
