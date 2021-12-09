package InterviewQuestions;
/*Given a non-empty array of integers nums, every element appears
twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use
only constant extra space.
Input: nums = [4,1,2,1,2]
Output: 4
*/

import java.util.Arrays;


public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        int ans = 0;
        for (int i = 0; i < nums.length; i++){
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if (nums[i] == nums[j]){
                   count++;
                }
            }
            if (count == 1){
                ans = nums[i];
            }
        }
        return ans;
    }

}
