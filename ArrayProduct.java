// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/**
 * Product of the array elements except the current element. For achiving this
 * without using division operator, we need to initialize a returnable array
 * that records the product of all elements on its right Do another traversal
 * from right following the same but replacing the elements with element *
 * runningRightProduct Return the array
 */
// Your code here along with comments explaining your approach
public class ArrayProduct {

    public int[] productExceptSelf(int[] nums) {
        int rSum = 1;
        int[] result = new int[nums.length];

        // left to right treversal
        for (int i = 0; i < nums.length; i++) {
            result[i] = rSum;
            // if(i>0)
            rSum *= nums[i];
        }

        // right to left traversal
        rSum = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rSum;
            // if(i < nums.length -1)
            rSum *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
