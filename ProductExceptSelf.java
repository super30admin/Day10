import java.util.Arrays;

/**
 * Time complexity: O(n)
 * Space complexity: O(1) Since the output array is returned,
 * output array does not count as extra space for space complexity analysis
 * Ran on leetcode? Yes
 * Issues faced? No
 *
 * Approach:
 *
 * Traverse array from the left to right,
 * maintaining running product of all the elements to the left and storing it in an output array
 * and then from the right to left while maintaining running product of all elements to the right
 * and multiplying that with output array value at that index.
 * Since the output array is returned and no additional array is used, the space complexity is O(1)
 */
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int[] output = new int[nums.length];
        int runningProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0)
                output[i] = runningProduct;
            else {
                runningProduct = runningProduct * nums[i - 1];
                output[i] = runningProduct;
            }
        }

        runningProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1)
                output[i] *= runningProduct;
            else {
                runningProduct = runningProduct * nums[i + 1];
                output[i] *= runningProduct;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] result = obj.productExceptSelf(nums);
        System.out.println("Result: " + Arrays.toString(result));
        assert(Arrays.equals(result, new int[]{24,12,8,6}));
    }
}
