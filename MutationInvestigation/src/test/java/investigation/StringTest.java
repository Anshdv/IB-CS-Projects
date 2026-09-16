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

    @Test
    public void lengthReturnsTheLengthOfTheString() {
        String river = "Mississippi";
        int trueLength = 11;

        assertEquals(trueLength, river.length());
    }

    @Test
    public void replaceReturnsTheNewStringAndLeavesTheOriginalAlone() {
        String river = "Mississippi";
        String replaced = river.replace("ss", "SS");

        assertEquals("MiSSiSSippi", replaced);  // what came back
        assertEquals("Mississippi", river);     // what happened to the original
    }

    // TODO: replace("ss", "SS")
    // TODO: trim()          on "  Hello, Space !  "
    // TODO: concat(", World!")
    // TODO: substring(0, 4)
    //
    // Every test needs BOTH assertions. Name each test after what it proves.
}
