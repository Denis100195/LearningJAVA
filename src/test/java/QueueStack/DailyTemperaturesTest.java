package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        int[] temp = {73,74,75,71,69,72,76,73};
        int[] exp = {1,1,4,2,1,1,0,0};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] result = dailyTemperatures.dailyTemperatures(temp);

        Assert.assertEquals(exp, result);
    }
}