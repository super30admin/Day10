/*
Time Complexity: O(n)+O(n)=O(2n)=O(n)
    The time complexity of this approach is O(n), where n is the length of the input array nums.

    We iterate through the array once to calculate totalProduct and zeroCount. O(n)
    We iterate through the array again to populate the result array based on zeroCount. O(n)
    Since both operations require only one pass through the array, the overall time complexity is O(n).

Space Complexity: O(1)
    The space complexity is O(1) in terms of additional space, if we exclude the output array result (as required
    by the problem’s constraints).

    We use a constant amount of extra space for totalProduct and zeroCount.
    The output array result is the only space we use beyond the input, and it does not count towards extra
    space in this context.

Did this code successfully run on Leetcode : yes
 */

import java.util.Arrays;

public class ProductArrayExceptSelfUsingDivision {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Step 1: Calculate the product of all non-zero elements and count zeros
        int totalProduct = 1;
        int zeroCount = 0;

        for (int num : nums) {
            if (num != 0) {
                totalProduct *= num;
            } else {
                zeroCount++;
            }
        }

        // Step 2: Create the result array based on zero count
        int[] result = new int[n];

        if (zeroCount > 1) {
            // More than one zero, all results are zero
            return result;
        } else if (zeroCount == 1) {
            // Exactly one zero, only the position with zero in `nums` gets the product
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    result[i] = totalProduct;
                }
            }
        } else {
            // No zeros, divide totalProduct by each element in `nums` to get result
            for (int i = 0; i < n; i++) {
                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ProductArrayExceptSelfUsingDivision sol = new ProductArrayExceptSelfUsingDivision();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sol.productExceptSelf(nums1)));  // Output: [24, 12, 8, 6]

        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(sol.productExceptSelf(nums2)));  // Output: [0, 0, 9, 0, 0]
    }
}
