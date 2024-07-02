// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Problem 1 Product of Array Except Self

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int[] left = new int[n];
//         int[] right = new int[n];

//         for(int i=1;i<n;i++) {
//             left[0] = 1;
//             left[i] = nums[i-1]*left[i-1];
//         }
//         int prefix  = 1;
//         for(int j=n-1; j>=0;j--)  {
            
//             left[j] = prefix* left[j];
//             prefix = nums[j]* prefix;
//         }

//         return left;
//     }
// }


//---------------------------------------------//
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int rp =1;
        result[0] = rp;
        for(int i=1;i<n;i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i=n-2; i>=0;i--)  {
            
            rp =rp * nums[i+1];
            result[i] = result[i] * rp ;
        }

        return result;
    }
}



