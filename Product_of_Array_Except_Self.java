// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
//approach: created an array to store the product except the number.In the first iteration
//iterated through the nums array from right to left and stored in the array. In the second
//iteration, iterated from right to left and multiplied it with already existing values in arr.
// Your code here along with comments explaining your approach
public class Product_of_Array_Except_Self {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int n=nums.length;
            int[] arr=new int[n];
            int rp=1;
            arr[0]=rp;
            for(int i=1;i<n;i++)
            {
                arr[i]=rp*nums[i-1];
                rp=arr[i];
            }
            int lp=1;
            for(int i=n-2;i>=0;i--)
            {
                lp=lp*nums[i+1];
                arr[i]=arr[i]*lp;
            }
            return arr;
        }
    }
}
