public class ProductExceptItself {//time and space - O(n)
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0) return nums;
        int len = nums.length;
        int[] res = new int[len];
        int[] left = new int[len];
        int[] right = new int[len];

        left[0] = nums[0];
        for(int i=1; i<len; i++){
            left[i] = left[i-1] * nums[i];
        }

        right[len-1] = nums[len-1];
        for(int i=len-2; i>=0; i--){
            right[i] = nums[i] * right[i+1];
        }

        for(int i=0; i<len; i++){
            res[i] = i>0 ? left[i-1] : 1;
            res[i] *= i<len-1 ? right[i+1] : 1;
        }

        return res;
    }
}
