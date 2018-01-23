package test;

import game.Dot;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * A test unit for the game.Dot class.
 *
 * @author Sean Strout @ RIT CS
 */
public class TestDot {
    @Test(expected=AssertionError.class)
    public void testNegativeRow() {
        new Dot(-1, 0);
    }

    @Test(expected=AssertionError.class)
    public void testNegativeColumn() {
        new Dot(0, -1);
    }

    @Test
    public void testAccessors() {
        Dot dot = new Dot(1, 2);
        assertEquals(1, dot.getRow());
        assertEquals(2, dot.getColumn());
    }

    @Test
    public void testString() {
        Dot dot = new Dot(3, 4);
        assertEquals(".", dot.toString());
    }

    @Test
    public void testEquals() {
        Dot dot1 = new Dot(3, 4);
        Dot dot2 = new Dot(3, 4);
        Dot dot3 = new Dot(4, 3);
        assertEquals(dot1, dot2);
        assertNotEquals(dot1, dot3);
    }
}
