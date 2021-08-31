package QueueStack;
/*You are given an integer array nums and an integer target.
You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.*/
public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        return countTarget(nums, 0, 0, target);
    }

    public int countTarget(int[] nums, int pos, int sum, int target){
        if (nums.length == pos){
            return sum == target ? 1 : 0;
        }
        return countTarget(nums, pos + 1, sum + -nums[pos], target)
                + countTarget(nums, pos + 1, sum + nums[pos], target);
    }
}
