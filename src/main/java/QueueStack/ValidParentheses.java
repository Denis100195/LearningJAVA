package QueueStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 Example 1:
 Input: s = "()"
 Output: true

 Example 2:
 Input: s = "()[]{}"
 Output: true

 Example 3:
 Input: s = "(]"
 Output: false

 Example 4:
 Input: s = "([)]"
 Output: false

 Example 5:
 Input: s = "{[]}"
 Output: true*/

public class ValidParentheses {
    public boolean isValid(String s) {
        char op1 = '(';
        char op2 = '[';
        char op3 = '{';

        char cl1 = ')';
        char cl2 = ']';
        char cl3 = '}';

        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        char[] ch = s.toCharArray();

        if (ch[0] == cl1 ||ch[0] == cl2 || ch[0] == cl3) return false;


        for (char c : s.toCharArray()){

            if (c == op1 || c == op2 || c == op3){
                stack.push(c);
            }
            else if (c == cl1 && !stack.isEmpty() && stack.peek() == op1){
                stack.pop();
            }
            else if (c == cl2 && !stack.isEmpty() && stack.peek() == op2){
                stack.pop();
            }
            else if (c == cl3 && !stack.isEmpty() && stack.peek() == op3){
                stack.pop();
            }
            else return false;
        }

        return stack.isEmpty();
    }

}
