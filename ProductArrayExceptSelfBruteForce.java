/*
Time Complexity: O(n)×O(n)=O(n^2).

    The time complexity is O(n²), as there are two nested loops.
    The outer loop iterates over each element in nums (O(n)).
    The inner loop computes the product of all elements except nums[i] (O(n)).

Space Complexity: O(1)

Did this code successfully run on Leetcode : No Time Limit Exceeded for an input of nums[] which is [-1,....-1]
huge input with just -1.

This brute force approach is not optimal for large arrays due to its quadratic time complexity, but it provides
a straightforward way to solve the problem.

 */
public class ProductArrayExceptSelfBruteForce {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) { // Exclude nums[i]
                    product *= nums[j];
                }
            }
            result[i] = product; // Store the product in the result array
        }

        return result;
    }
}
