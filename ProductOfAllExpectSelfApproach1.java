// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * L2R Product: Start with as index 0 as 1  and in the current index multiply prev val with prev index in nums array.
 * R2L product: Start with nums.length-1 as 1 and the current index is obtained by multiplying next value with next value in index array;
 * 
 * L2R array gives the product of all elements shifted to one place right
 * R2L array gives the product of all elements shifted one place to the left
 * 
 * by multiplying both we get the answer; i.e., the product of elements except self.
 */

public class ProductOfAllExpectSelfApproach1 {

    public int[] productExceptSelf(int[] nums) {

        int[] prodL2R = new int[nums.length];
        prodL2R[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prodL2R[i] = nums[i - 1] * prodL2R[i - 1];
        }

        int[] prodR2L = new int[nums.length];
        prodR2L[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            prodR2L[i] = nums[i + 1] * prodR2L[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            prodL2R[i] = prodL2R[i] * prodR2L[i];
        }

        return prodL2R;

    }

}