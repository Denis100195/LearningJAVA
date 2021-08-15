package Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void thirdMax() {
        int[] nums = {1,1,2};
        int result = new ThirdMaximumNumber().thirdMax(nums);
        Assert.assertEquals(2, result);
    }
}