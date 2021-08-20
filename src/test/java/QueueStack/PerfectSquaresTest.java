package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectSquaresTest {

    @Test
    public void numSquares() {
        PerfectSquares perfectSquares = new PerfectSquares();
        int result = perfectSquares.numSquares(12);
        Assert.assertEquals(3, result);
    }
}