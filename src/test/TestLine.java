package test;

import game.Dot;
import game.Line;
import game.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * A test unit for the game.Line class.
 *
 * @author Sean Strout @ RIT CS
 */
public class TestLine {
    @Test(expected=AssertionError.class)
    public void testBadHoriLines() {
        new Line(new Dot(0,1), new Dot(0, 0));
        new Line(new Dot(0,0), new Dot(2, 0));
    }

    @Test(expected=AssertionError.class)
    public void testBadVertLines() {
        new Line(new Dot(1, 0), new Dot(0, 0));
        new Line(new Dot(0, 0), new Dot(0, 2));
    }

    @Test
    public void testGoodHoriLine() {
        Line horiLine = new Line(new Dot(0,0), new Dot(0,1));
        assertEquals(0, horiLine.getFirst().getRow());
        assertEquals(0, horiLine.getFirst().getColumn());
        assertEquals(0, horiLine.getSecond().getRow());
        assertEquals(1, horiLine.getSecond().getColumn());
        assertEquals(false, horiLine.hasOwner());
        assertEquals(Player.NONE, horiLine.getOwner());
        assertEquals(" ", horiLine.toString());
        horiLine.claim(Player.RED);
        assertEquals(true, horiLine.hasOwner());
        assertEquals(Player.RED, horiLine.getOwner());
        assertEquals("-", horiLine.toString());
    }

    @Test
    public void testGoodVertLine() {
        Line vertLine = new Line(new Dot(0,0), new Dot(1,0));
        assertEquals(0, vertLine.getFirst().getRow());
        assertEquals(0, vertLine.getFirst().getColumn());
        assertEquals(1, vertLine.getSecond().getRow());
        assertEquals(0, vertLine.getSecond().getColumn());
        assertEquals(false, vertLine.hasOwner());
        assertEquals(Player.NONE, vertLine.getOwner());
        assertEquals(" ", vertLine.toString());
        vertLine.claim(Player.BLUE);
        assertEquals(true, vertLine.hasOwner());
        assertEquals(Player.BLUE, vertLine.getOwner());
        assertEquals("|", vertLine.toString());
    }

    @Test
    public void testEquals() {
        Line line1 = new Line(new Dot(0,0), new Dot(0, 1));
        Line line2 = new Line(new Dot(0,0), new Dot(0, 1));
        Line line3 = new Line(new Dot(0,0), new Dot(1, 0));
        assertEquals(line1, line2);
        assertNotEquals(line1, line3);
    }
}
