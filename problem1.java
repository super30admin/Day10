// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
//take right running sum and left running sum in same array and multiply it in same array(result)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] =1;
        for(int i=1; i<n; i++){
            result[i] = result[i-1]*nums[i-1];
        }
        int prev =1;
        for(int i=n-2; i>=0; i--){
            prev=prev*nums[i+1];
            result[i]=result[i]*prev;
        }
        return result;
    }
}