// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/* First declaring rp = 1 and setting that to first element in result array next computing by multiplying the n-1 element
to rp and storing at ith index of result array to get the left array. Next loop setting back the rp =1 again and
then computing the right array by starting from n-2 element and multiplying the rp * nums[n+1] and going back in the loop
finally result = my result array * computed product for rp *  nums[i+1]*/

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null ||  nums.length == 0){
            return new int[] {};
        }
        int n = nums.length;
        int rp = 1;
        int[] result = new int[n];
        result[0] = rp;
        for(int i=1;i<nums.length;i++){
            rp = rp  *nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int i =n-2; i>=0;i--){
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}