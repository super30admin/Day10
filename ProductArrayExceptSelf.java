/*
    Leetcode problem 238: Product of Array Except Self 
    T.C: O(n) - O(n + n) :: S.C: O(1) - an Output array is expected

    Solved using running product; First look into brute force approach (i.e run a loop for each element to calculate the product but itself)
    Second, you observe that each element from the left of current element has to be multiplied and the same way around from the right. We
    can consider the initial running product from left and right be 1, and then run a loop from left by calculating the running product of 
    the left element(s) and store it at the current index of the resultant array and perform the same operation from the right. You need to
    pay attention to the edge case (of not multiplying the current element itself when you traverse right - on paper) as there is no edge case.
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) return new int[] {};

        int n = nums.length;
        //int rProduct = 1;
        int[] result = new int[n];
        int lp = 1, rp = 1, l = 1, r = n - 2;

        result[0] = lp;
        result[n - 1] = rp;

        while (l < n && r >= 0) {

            if (l == r) {
                result[l] = (nums[l - 1] * lp) * (nums[r + 1] * rp);
                lp = nums[l - 1] * lp;
                rp = nums[r + 1] * rp;
            } 
            else if (l > r) {
                result[l] *= nums[l - 1] * lp;
                result[r] *= nums[r + 1] * rp;
                lp = nums[l - 1] * lp;
                rp = nums[r + 1] * rp;
            }            
            else {
                result[l] = nums[l - 1] * lp;
                result[r] = nums[r + 1] * rp;
                lp = nums[l - 1] * lp;
                rp = nums[r + 1] * rp;
            }

            l++; r--;
        }

/*
        result[0] = rProduct;

        for (int i = 1; i < n; i++) {
            rProduct *= nums[i - 1];
            result[i] = rProduct;
        }

        rProduct = 1;

        for (int i = n - 2; i >= 0; i--) {
            rProduct *= nums[i + 1];
            result[i] *= rProduct;
        }
*/

        return result;
    }
}