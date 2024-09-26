class Solution {
    // Running Sum/ Product Type
    // Time Complexity: O(n) Asymptotically
    // Space Complexity : O(n) which is not efficient as we have craeetd three new arrays to get at our result.
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return new int[]{};
        }

        int[] result = new int[nums.length];
        int rightProduct = 1; 
        for(int i=0;i<nums.length;i++)
        {
            result[i] = rightProduct;
            rightProduct*=nums[i];
        }   
        rightProduct=1;
        for(int i= nums.length-2;i>=0;i--)
        {
            rightProduct*=nums[i+1];
            result[i]*=rightProduct ;   
        }
        return result;

    }
}
