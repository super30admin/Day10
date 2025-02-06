public class ProductExceptSelf {
    public static int[] productExceptSelfElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int rp = 1;
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] results = new int[nums.length];
        results = productExceptSelfElement(nums);
        for(int i=0;i<results.length;i++)
        {
            System.out.println(results[i]);
        }
    }
}
