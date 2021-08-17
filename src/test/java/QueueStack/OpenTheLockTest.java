package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OpenTheLockTest {

    @Test
    public void openLock() {
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";

        OpenTheLock openTheLock = new OpenTheLock();
        int count = openTheLock.openLock(deadends, target);

        Assert.assertEquals(6, count);

    }
}