/*
* Leecode : 238
* This is the best solution that can also be done by creating 2 arrays i.e., the left product array, and the right product array. 
* The main concept is since given no division, the product is product of left side values and right side values
*   Time Complexity :O(n)
*   Space Complexity :O(1)
*/
class ProductArray{
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = rp;
            rp*=nums[i];
        }

        rp = 1;
        for(int i=nums.length-2;i>=0;i--){
            rp *=nums[i+1];
            result[i] *= rp;  
        }

        return result;
    }
}