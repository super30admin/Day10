// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
// keep a track of running sum while traversing from left to right and then from right to left.

public class ProductExceptSelf {
        public int[] productExceptSelf(int[] nums) {
            int rp =1;
            int n = nums.length;
            int[] result = new int[n];
            result[0] =1;
            for(int i=1;i<n;i++){
                rp = rp * nums[i-1];
                result[i] = rp;
            }
            rp=1;
            for(int i=n-2;i>=0;i--){
                rp = rp * nums[i+1];
                result[i] *= rp;
            }
            return result;
        }
}
