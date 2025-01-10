// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
/*
First loop computes the running product of each number and stores it in the array result
Second stores the rp from the right and stores it in the array result
Now result has what we need
 */
import java.util.Arrays;

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp=1;
        int [] result = new int[n];
        if(nums==null || nums.length==0){
            return result;
        }
        result[0]=rp;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=result[i]*rp;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(nums)));
    }
}