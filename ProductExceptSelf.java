// Time Complexity : O(2n) 
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        
        
        int [] result=new int[n];
        int rp=1;
        result[0]=rp;
        // left pass
        
        for(int i=1;i<n;i++){
            rp=nums[i-1]*rp;
            result[i]=rp;
        }
        
        rp=1;
        //right pass
        for(int i=n-2;i>=0;i--){
            rp=nums[i+1]*rp;
            result[i]=result[i]*rp;
        }
        return result;
    }
}