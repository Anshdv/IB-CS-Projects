package test.java.investigation;

import java.awt.Rectangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Investigates whether Rectangle methods change the rectangle they are called on.
 */
public class RectangleTest
{
    /**
     * Proves that translate moves the rectangle it is called on.
     * Note the delta on assertEquals -- getX returns a double.
     */
    @Test
    public void translateChangesTheRectangleItIsCalledOn()
    {
        Rectangle box = new Rectangle(5, 10, 20, 30);

        box.translate(15, 25);                  // returns nothing

        assertEquals(20, box.getX(), 0.001);    // the original changed
        assertEquals(35, box.getY(), 0.001);
    }

    // TODO: getWidth()
    // TODO: setSize(40, 40)

    // TODO: grow(5, 5)
    //       PREDICTION: write what you think this does, BEFORE you write the test.
    //       If your test fails, leave the prediction and add what really happens.

    // TODO: intersection(otherRectangle)
    //       Test what happens to BOTH originals.
    //       Then say whether it is an accessor or a mutator, and how you know.

    // TODO: contains(10, 20)

    /**
     * Proves that two variables can refer to the same rectangle.
     */
    @Test
    public void twoVariablesCanReferToTheSameRectangle()
    {
        Rectangle box  = new Rectangle(5, 10, 20, 30);
        Rectangle box2 = box;

        box2.translate(15, 25);

        assertEquals(20, box.getX(), 0.001);

        // TODO: why does this pass? box was never named on the line that moved anything.
    }
}
