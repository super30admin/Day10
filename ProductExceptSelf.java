//Time Complexity: O(n)because we iterate over the array twice.
//Space Complexity: O(1), excluding the output array, as we only use a single variable right
// run on leetcode : Yes
// Any problems faced: No
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Calculate the left product
        int rp = 1;
        result[0] = rp; // Initialize the first element of result to 1

        for (int i = 1; i < n; i++) {
            rp *= nums[i - 1]; // Calculate product of all elements to the left of the current element
            result[i] = rp;     // Store running product in result array
        }

        // Step 2: Calculate the right product and update result array
        rp = 1; // Reset rp
        for (int i = n - 2; i >= 0; i--) {
            rp *= nums[i + 1]; // Calculate product of all elements to the right of the current element
            result[i] *= rp;   // Multiply the left product with the right product in the result array
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExceptSelf sol = new ProductExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);

        // Print the result array
        System.out.print("Output: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
