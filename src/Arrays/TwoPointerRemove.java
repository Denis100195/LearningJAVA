package Arrays;

public class TwoPointerRemove {
    public int removeDuplicates(int[] nums) {

        // Check for edge cases.
        if (nums == null) {
            return 0;
        }

        // Use the two pointer technique to remove the duplicates in-place.
        // The first element shouldn't be touched; it's already in its correct place.
        int writePointer = 1;
        // Go through each element in the Array.
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            // If the current element we're reading is *different* to the previous
            // element...
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++;
            }
        }

        // This turns out to be the correct length value.
        return writePointer;
    }
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/

    public void moveZeroes(int[] nums){
        int writePointer = 0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            // If the current element we're reading is zero
            if (nums[readPointer] != 0) {
                // Copy it into the next position at the front, tracked by writePointer.
                nums[writePointer] = nums[readPointer];
                // And we need to now increment writePointer, because the next element
                // should be written one space over.
                writePointer++;
            }
        }
        while (writePointer < nums.length){
            nums[writePointer] = 0;
            writePointer++;
        }
    }
/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.
Example:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.*/

    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int writePointer = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                result[writePointer] = nums[i];
                writePointer++;
            }
        }
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                result[writePointer] = nums[i];
                writePointer++;
            }
        }
        return result;
    }
}
