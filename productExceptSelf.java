// Time Complexity :3O(n) ~ O(n)
// Space Complexity : 2O(n) ~O(n)
// Did this code successfully run on Leetcode : yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] n1 = new int[nums.length];
        int[] n2 = new int[nums.length];
        int n = nums.length - 1;

        n1[0] = 1; n2[n] = 1;
        for(int i = 1; i <=n; i++){
            n1[i] = nums[i - 1] * n1[i-1];
        }

        for(int i = n-1; i >=0; i--){
            n2[i] = nums[i + 1] * n2[i+1];
        }

        for(int i = 0; i <=n; i++){
            n1[i] = n1[i] * n2[i];
        }

        return n1;

    }
}