package main.java.investigation;

import java.awt.Rectangle;

/**
 * Demonstrates the difference between methods that return a new object
 * and methods that change the object they are called on.
 *
 * TODO: replace this comment with your own description, and add your name.
 */
public class Investigation
{
    /**
     * Prints three before-and-after comparisons.
     *
     * @param args not used
     */
    public static void main(String[] args)
    {
        // ---------- String ----------
        String river = "Mississippi";

        System.out.println("Before toUpperCase: " + river);
        System.out.println("Returned:           " + river.toUpperCase());
        System.out.println("After toUpperCase:  " + river);
        System.out.println();

        // ---------- StringBuilder ----------
        // TODO: construct a StringBuilder holding "Hi".
        //       Print it, then call append(", World!") and print it again.
        //       Match the column format above exactly.


        // ---------- Rectangle ----------
        // TODO: construct new Rectangle(5, 10, 20, 30).
        //       Print getX(), call translate(15, 25), print getX() again.
        //       translate returns nothing, so print the word "nothing".

    }
}
