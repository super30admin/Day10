
// Time Complexity : O(n)
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class ProductOfArrayExceptSelf {

    public static void main(String[] args)
    {

        int[] nums = {1,2,3, 4};
        System.out.println(productExceptSelf(nums));
    }

    public static int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0) {
            return nums;
        }

        int n = nums.length;

        int[] result = new int[n];
        int rp = 1;
        result[0] = 1;

        //  left to right
        for(int i = 1; i < n; i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

//        System.out.println(Arrays.toString(result));

        // 1 1 2 6
        rp = 1;
        for(int i = n-2; i >= 0; i--) {
            //  1*4
            rp = rp * nums[i+1];
//            24 is rp
            System.out.println(rp + "==========" + result[i]);
            result[i] = result[i] * rp;
        }

        return result;

    }
}
