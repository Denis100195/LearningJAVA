package InterviewQuestions;

import java.util.ArrayList;

import java.util.List;

/**You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant
 * in left-to-right order. The large integer does not contain any leading 0's.

 Increment the large integer by one and return the resulting array of digits.
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] newDigits;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] == 9){
                if (i == 0){
                    newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    newDigits[1] = 0;
                    for (int k = 2; k < newDigits.length; k++){
                        newDigits[k] = digits[k-1];
                    }
                    return newDigits;
                }else {
                    digits[i] = 0;
                }
            }
            else {
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}
