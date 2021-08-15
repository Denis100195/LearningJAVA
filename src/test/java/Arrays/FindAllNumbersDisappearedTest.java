package Arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FindAllNumbersDisappearedTest {

    @Test
    public void findDisappearedNumbers() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        List<Integer> res = new FindAllNumbersDisappeared().findDisappearedNumbers(nums);
        Assert.assertEquals(list, res);
    }
}