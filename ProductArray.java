// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
Iterate through the array from left to right and store all the product to left of index.
Iterate through the array from right to left and store all the product to right of index.
Multiply both the products.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        //first we calculate product of elements on the left of index except itself
        result[0] = 1;

        for(int i = 1; i < n; i++) {

            result[i] = result[i - 1] * nums[i - 1];
        }

        //Then we calculate product of elements on the right side except itself and multiply it to product on all elements except itself on left side.
        int r = 1;
        for(int j = n - 2; j >= 0; j--) {

            //Cal product of all elements on right side of index
            r = r * nums[j + 1];

            //multiple result we get from right side to result we already got from left side
            result[j] = result[j] * r;
        }

        return result;
        //Time complexity : O(n)
        //Space complexity : O(1)
    }
}