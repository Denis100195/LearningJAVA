package Arrays;

import java.util.Arrays;

/*A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height.
Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].

Example:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation:
heights:  [1,1,4,2,1,3]
expected: [1,1,1,2,3,4]
Indices 2, 4, and 5 do not match.*/
public class EcpectedNumbers {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sort = new int[heights.length];
        for (int i = 0; i < heights.length; i++){
            sort[i] = heights[i];
        }
        Arrays.sort(sort);
        for (int i = 0; i < heights.length; i++){
            if (heights[i] != sort[i]) count++;
        }
        return count;
    }
}
