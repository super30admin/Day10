// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * Approach-1
 * L2R Product: Start with as index 0 as 1  and in the current index multiply prev val with prev index in nums array.
 * R2L product: Start with nums.length-1 as 1 and the current index is obtained by multiplying next value with next value in index array;
 * 
 * L2R array gives the product of all elements shifted to one place right
 * R2L array gives the product of all elements shifted one place to the left
 * 
 * by multiplying both we get the answer; i.e., the product of elements except self.
 * 
 * Approach-2:
 * what are we essientially doing in L2R -> each cell at i-1 holds the running sum in the new array
 * similarly R2L -> each cell at i+1 holds the running sum upto (not including) the current index
 * 
 * So instead of holding the cache in memory of an array.. we can hold it in a vairable
 */

public class ProductOfAllExpectSelfApproach2 {

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];

        int rp = 1;

        result[0] = rp;
        for (int i = 1; i < nums.length; i++) {
            rp = nums[i - 1] * rp;
            result[i] = rp;
        }

        rp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }

        return result;

    }

}