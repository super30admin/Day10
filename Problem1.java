import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// Time Complexity :O(n)
// Space Complexity :O(1)-> as the result array we're using is what the problem ask us to return.
// Did this code successfully run on Leetcode :Yes
public class Problem1 {
    //approach is to first find the running product to the left and right product and then final result will be left*right
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[]{0};
        }
        int rProduct = 1;
        int[] result = new int[nums.length];
        result[0] = rProduct;
        for(int i = 1;i<nums.length;i++){
            rProduct = rProduct * nums[i-1];
            result[i] = rProduct;
        }

        rProduct = 1;
        for(int i = nums.length-2;i>=0;i--){
            rProduct = rProduct * nums[i+1];
            result[i] = result[i] * rProduct;
        }
        return result;
    }
}
