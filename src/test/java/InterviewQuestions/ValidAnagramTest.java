package InterviewQuestions;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidAnagramTest {
    String s = "rat";
    String t = "car";
    ValidAnagram va = new ValidAnagram();

    @Test
    public void isAnagram() {
        Assert.assertTrue(va.isAnagram(s, t));
    }
}