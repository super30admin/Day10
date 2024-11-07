// Approach : From the intution of brute force where we have to iterate through array multiple time to make the product.
// we will create all left product and store it in the result array.
// Time : O(n + n) = O(n)
// Space: O(1) # not considering the o/p
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // edge case: 
        if(nums == null || nums.length==0) return new int[0];
        int[] result = new int[nums.length];
        int rp = 1 ;
        int temp = 1;
        
        // left pass
        for(int i=0;i<nums.length;i++){
            rp= rp*temp;
            result[i] = rp;
            temp = nums[i]; // number we skipped;
        }

        rp=1;
        temp=1;
        // right pass
        for(int i = nums.length-1;i>=0;i--){
            rp = rp* temp;
            result[i]= result[i]* rp;
            temp = nums[i];
        }
        return result;
    }
}