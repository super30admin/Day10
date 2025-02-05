//Brute force using division operator 

// Time Complexity : O(2n) ~ O(n)
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - We simply divide the total product from the number in the index

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums){
        int totalProduct = 1;
        int zeroCount = 0;

        // Calculate total product and count zeros
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                totalProduct *= num;
            }
        }

        int[] result = new int[nums.length];

        // Generate result array
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                result[i] = 0; // More than one zero means all products will be zero
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0; // Only the zero position gets the product
            } else {
                result[i] = totalProduct / nums[i]; // Normal case
            }
        }

        return result;
    }
}

// Time Complexity : O(3n) because of 3 for loops which becomes O(n).
// Space Complexity : O(3n) because of 3 new arrays which becomes O(n).
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - We make a prefix array and a suffix array then we multiply the two to make the answer array. For the prefix array we make the first element as 1 
// start the for loop from 2 element or index 1; multiply first element of prefix with first element of nums. Same logic for suffix but in reverse which is from the end.

// Your code here along with comments explaining your approach

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];  
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i ++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i --) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i ++) {
        ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }
}

//SC optimised

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution3 {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)   return nums;
        int n = nums.length;
        int[] result = new int[n];
        int runningProduct = 1;
        result[0] = 1;
        
        // left to right 
        for (int i = 1; i < n; i ++) {
            runningProduct *= nums[i - 1];
            result[i] = runningProduct;
        }

        //right to left 
        runningProduct = 1;
        for (int i = n - 2; i >= 0; i --) {
            runningProduct *= nums[i + 1];
            result[i] = result[i] * runningProduct;
        }
        return result;
    }
}