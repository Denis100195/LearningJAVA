package InterviewQuestions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    int[] digits1 = {4,3,2,1};
    int[] digits2 = {9,9,9,9};
    int[] digits3 = {1,9,9};

    @Test
    public void plusOne() {
        Assert.assertEquals(new int[] {2,0,0}, new PlusOne().plusOne(digits3));
    }
}