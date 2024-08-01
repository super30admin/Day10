// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
public class ProductMinusCurrent {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int runsum = 1;
        result[0] =1;
        for(int i= 0;i<n;i++){
            result[i] = runsum;
            runsum = runsum*nums[i];
        }
        int endsum=1;
        for(int j =n-1;j>=0;j--){
            result[j] = result[j]*endsum;
            endsum = endsum*nums[j];
        }

        return result;
    }
}