
//TC: O(n)
//SC:  O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //null
        if(nums==null || nums.length==0) return nums;
        int n=nums.length;
        int [] result = new int[n];
        int rp=1;
         result[0]=1;
        for (int i=1;i<n;i++){
            rp*=nums[i-1];
            result[i]=rp;
        
        }rp=1;
        for(int i=n-2;i>=0;i--){
            rp*=nums[i+1];
            result[i]=result[i]*rp;

        }return result;
    }
}