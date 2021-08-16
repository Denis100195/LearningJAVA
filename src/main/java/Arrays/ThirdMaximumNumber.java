package Arrays;
/*Given integer array nums, return the third maximum number in this array. If the third maximum does not exist, return the maximum number.*/
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Integer fstMax = null;
        Integer scdMax = null;
        Integer trdMax = null;
        for (Integer num : nums){
            if(num.equals(fstMax) || num.equals(scdMax) || num.equals(trdMax)){
                continue;
            }
            if (fstMax == null || num > fstMax){
                trdMax = scdMax;
                scdMax = fstMax;
                fstMax = num;
            }
            else if (scdMax == null || num > scdMax){
                trdMax = scdMax;
                scdMax = num;
            }
            else if (trdMax == null || num > trdMax) {
                trdMax = num;
            }
        }

        if (trdMax == null) {
            return fstMax;
        }

        return trdMax;
    }
}
