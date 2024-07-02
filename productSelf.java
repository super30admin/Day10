/*
TC --> O(n)
SC --> O(1)
 */
class Solution {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];

        }//for

        int rp = 1;
        for (int j = n - 2; j >= 0; j--) {
            rp = rp * nums[j + 1];
            prefix[j] = prefix[j] * rp;

        }

        return prefix;

    }
}
