package test.java.investigation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * TODO: Both String and StringBuilder hold a sequence of characters.
 *       Why does Java provide both? Name one situation where each is
 *       the better choice. Answer here, in this comment.
 */

/**
 * Investigates whether StringBuilder methods change the object they are called on.
 */
public class StringBuilderTest
{
    // TODO: length()
    // TODO: append(", World!")   on a StringBuilder holding "Hello"
    // TODO: insert(0, "Oh, ")    on a StringBuilder holding "Hello"
    // TODO: reverse()            on a StringBuilder holding "desserts"
    // TODO: toString()           on a StringBuilder holding "Hello"
    //
    // WARNING: assertEquals compares objects. A StringBuilder is not a String
    // even when the characters match. Work out what you need to do about that.
}
