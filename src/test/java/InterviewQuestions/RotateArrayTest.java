package InterviewQuestions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {

    private int[] nums = {1,2,3,4,5,6,7};
    RotateArray rotateArray = new RotateArray();
    private int[] exp = {5,6,7,1,2,3,4};
    @Test
    public void rotate() {
        rotateArray.rotate(nums, 3);

    }
}