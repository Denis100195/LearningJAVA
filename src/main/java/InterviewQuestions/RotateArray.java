package InterviewQuestions;

/*Given an array, rotate the array to the right by k steps,
where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
* */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        int s = 0;

        while (k > 0){
            res[s] = nums[nums.length - k];
            s++;
            k--;
        }

        for (int i = k; i < res.length; i++){
            res[i] = nums[i-k];

        }
    }
}
