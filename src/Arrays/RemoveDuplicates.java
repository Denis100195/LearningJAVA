package Arrays;

public class RemoveDuplicates {

    /*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/

    public int removeDuplicates(int[] nums) {
        int k = 0;
        int cur = 1000;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != cur){
                nums[k++] = nums[i];
            }
            cur = nums[i];
        }

        return k;
    }
/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
* Example
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
