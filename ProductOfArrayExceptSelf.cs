// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
// using running product, calculate left product and store it in result
// and in reverse loop calculate right product and multiply it with result(which has the left product)
public class Solution {
    public int[] ProductExceptSelf(int[] nums) {
        int n = nums.Length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        //left pass
        for(int i=1; i<n;i++){
            rp = nums[i-1]*rp;
            result[i] = rp;
        }

        rp=1;
        //right pass
        for(int i=n-2; i>=0; i--){
            rp = nums[i+1] * rp;
            result[i] = result[i] * rp; //already available result which contains left product * right product
        }
         return result;
    }
}