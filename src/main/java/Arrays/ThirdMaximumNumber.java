package Arrays;
/*Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.*/
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        int fstMax = -2147483648;
        int scdMax = -2147483648;
        int trdMax = -2147483648;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > fstMax){
                trdMax = scdMax;
                scdMax = fstMax;
                fstMax = nums[i];
            }
            if (nums[i] < fstMax && nums[i] > scdMax){
                trdMax = scdMax;
                scdMax = nums[i];
            }
            if (nums[i] < fstMax && nums[i] < scdMax && nums[i] > trdMax) trdMax = nums[i];
        }
        //if () return fstMax;

        return trdMax;
    }
}
