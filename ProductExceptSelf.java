// Time Complexity :o(n)
// Space Complexity :o(1) - using an array to store value and returning it so can call it constant
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// start by taking a result array of same length
// variable to store running product and initialize it to 1
//add first element as 1 as no product to the left of first element
//start traversing starting index 1 as 0 index is filled with 1. .
// multiply running product by  the i-1 element and store in i postion of result.
//repeat until last index
//start traversing backwards, starting from n-2 index as n-1 is last index
// as there is nothing ot the right of it
// re intialize running product to 1
//multiply running product with i+1 and then with i postion of
// result arary and store i nthe result  array.
// repeat until i is ==0.
//return the array


public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        // calculate the left product
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}
