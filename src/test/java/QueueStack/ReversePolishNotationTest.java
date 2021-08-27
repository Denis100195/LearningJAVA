package QueueStack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePolishNotationTest {

    @Test
    public void evalRPN() {
        String[] tok = {"4","13","5","/","+"};
        ReversePolishNotation reversePolishNotation = new ReversePolishNotation();
        int res = reversePolishNotation.evalRPN(tok);

        Assert.assertEquals(6, res);
    }
}