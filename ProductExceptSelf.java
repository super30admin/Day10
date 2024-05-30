// Time Complexity - O(n)
// Space Complexity - O(1). - we are not using additional space. method itself returns an array. 
//Approach - Iterate over the entire array and compute the product of the elemeents to the left of each element. By default, first eleemnt wont have a left elemeent. 
//Now, for the last element, we wont have a right element so we dont make changes to that position of the array. For the rest, compute the product of the elements to the right and multiply with the left
//product. 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0|| nums == null){
            return new int[] {};
        }
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        int rp = 1;
        for(int i = 1; i < n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;   // left prod array ready. 
        }
        rp = 1;
        for(int i = n-2; i >= 0 ; i--){
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;

        }
        return result;

    }

}