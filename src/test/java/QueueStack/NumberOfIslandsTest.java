package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfIslandsTest {

    @Test
    public void numIslands() {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        char[][] grid2 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '0', '1', '1'}
        };
        char[][] grid3 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'},
                {'0', '1', '0', '1', '1'}
        };
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        Assert.assertEquals(1, numberOfIslands.numIslands(grid1));
    }
}