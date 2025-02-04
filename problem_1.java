// Time Complexity :O(n)
// Space Complexity :Auxiliary O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.Arrays;
class problem_1 {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int n = nums.length;
        int [] result = new int[n];
        int rp = 1;
        result[0] = 1;
        // l to r
        for(int i =1; i < n; i++){
            rp *= nums[i-1];
            result[i]= rp;
        }
        // r to l
        rp = 1;
        for(int i = n-2; i >= 0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }

    public static void main(String args[]){
        problem_1 obj = new problem_1();
        // test case 1
        int [] nums = {1,2,3,4};
        int [] output = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(output));
    }
}