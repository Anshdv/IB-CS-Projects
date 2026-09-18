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

        box.translate(15, 25);

        assertEquals(20, box.getX(), 0.001);
        assertEquals(35, box.getY(), 0.001);
    }

    /**
     * Proves that getWidth simply returns the width of the Rectangle it was called on
     */
    @Test
    public void getWidthReturnsTheWidthOfTheRectangle() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        double width = box.getWidth();

        assertEquals(20, width, 0.001);
    }

    /**
     * Proves that setSize changes the width and height of the Rectangle it was called on
     */
    @Test
    public void setSizeChangesTheSizeOfTheRectangle() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.setSize(40, 40);

        assertEquals(40, box.getWidth(), 0.001);
        assertEquals(40, box.getHeight(), 0.001);
    }

    /**
     * Proves that grow scales the Rectangle it was called on
     */
    @Test
    public void growIncreasesTheSizeOfTheRectangle() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.grow(5, 5);  // PREDICTION: the box will increase its width and height by 5 on all four sides

        assertEquals(30, box.getWidth(), 0.001);
        assertEquals(40, box.getHeight(), 0.001);
    }

    /**
     * Proves that intersection creates a new Rectangle with vertices where two other Rectangles intersect
     */
    @Test
    public void intersectionCreatesANewRectangleWhereTwoOthersIntersect() {
        Rectangle box1 = new Rectangle(5, 10, 20, 30);
        Rectangle duplicateOfBox1 = new Rectangle(box1);
        Rectangle box2 = new Rectangle(15, 20, 20, 30);
        Rectangle duplicateOfBox2 = new Rectangle(box2);
        Rectangle intersectionBox = box1.intersection(box2);
        Rectangle expectedIntersectionBox = new Rectangle(15, 20, 10, 20);

        assertEquals(duplicateOfBox1, box1);
        assertEquals(duplicateOfBox2, box2);
        assertEquals(expectedIntersectionBox, intersectionBox);

        // intersection is an accessor since it does not change the
        // original two rectangles it used to create the new one
    }

    /**
     * Proves that contains checks if a coordinate point is inside a Rectangle
     */
    @Test
    public void containsChecksIfTheRectangleContainsThePoint() {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        boolean containsTenTwenty = box.contains(10, 20);

        assertEquals(true, containsTenTwenty);
    }

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

        // The line after the Rectangle instantiation just creates another pointer to the actual Rectangle object
        // If one pointer is used to change the object, another pointer will reflect that change
        // since both pointers point to the same Rectangle in the heap
    }
}
