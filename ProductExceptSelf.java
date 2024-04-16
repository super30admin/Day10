/**

Approach: Running Product from left and from right. Find the current ans with both values.
TC-O(N), SC-O(1)
 */

 class Solution {
    public int[] productExceptSelf(int[] nums) {

    int[] ans = new int[nums.length];
    int r = 1;
    //left product
    ans[0]=1;
    for(int i=1;i<nums.length;i++){
        ans[i] = ans[i-1]*nums[i-1];
    }

    //right product and final answer
    for(int i=nums.length-1;i>=0;i--){
        ans[i]=ans[i]*r;
        r=r*nums[i];
    }
   
    return ans;
    }
}