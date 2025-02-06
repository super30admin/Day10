/* Time Complexity: O(n) where n is input array length
 * Space Complexity: Auixiliary O(n) for the right product array.
 * Leetcode: yes
 * Any Problems: no
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //left is the array of products of left side elements at any particular index
        int[] left = new int[nums.length];
        //right is the array of products of right side elements at any particular index
        int[] right = new int[nums.length];
        //at starting index the left product will be 1
        left[0] = 1;
        //same way at ending index the right product will be 1
        right[nums.length-1] = 1;
        for(int i=1, j=nums.length-2; i<nums.length && j>=0; i++, j--)
        {
            left[i] = left[i-1] * nums[i-1];
            right[j] = right[j+1] * nums[j+1];
        }

        for(int i=0; i<nums.length; i++)
            left[i] *= right[i];
        return left;
    }
}