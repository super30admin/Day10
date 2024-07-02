import java.util.Arrays;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/*
Calculate prefix products and store in the result array. While calculating postfix products, use running products
and store the running product at the same position in the result array which stores all the products except final.
 */

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for(int i=1; i<n; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        int rp = 1;
        for(int i=n-2; i>=0; i--) {
            rp *= nums[i+1];
            result[i] *= rp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Product except self for given nums is " +
                Arrays.toString(productExceptSelf(nums)));
    }
}