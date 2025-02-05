// Taking product of left and right of the current index
// Taking a combined product at each position

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return nums;
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;
        for(int i =1; i< nums.length; i++){
           rp *= nums[i-1];
           result[i] = rp;
        }
          rp = 1;
        for(int i = nums.length - 2; i>=0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }

        return result;
        
    }
}