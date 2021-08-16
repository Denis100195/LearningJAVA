package Arrays;

import java.util.*;

public class FindAllNumbersDisappeared {
    /*Given an array nums of n integers where nums[i] is in the range [1, n],
    return an array of all the integers in the range [1, n] that do not appear in nums.
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]*/
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> fullList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : nums){
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++){
            if (!set.contains(i)){
                fullList.add(i);
            }
        }

        return fullList;
    }
}
