//TC: O(n)
//SC: O(1)
//approach: create an array, in first iteration of array update ans array with left products using running product
// in second iteration from reverse, multiply that left product in ans array by right products using running product

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int runningProduct = 1;
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            runningProduct = runningProduct * nums[i - 1];
            ans[i] = runningProduct;
        }
        runningProduct = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            runningProduct = runningProduct * nums[i + 1];
            ans[i] = ans[i] * runningProduct;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        for (int n : productExceptSelf(nums)) {
            System.out.println(n);
        }
    }
}
