package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void isValid() {
        String s = "(({}))";
        ValidParentheses validParentheses = new ValidParentheses();

        Assert.assertTrue(validParentheses.isValid(s));
    }
}