// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
         int length = nums.length;
         int[] answer = new int[length];

         // Calculate the product of elements to the left of each element
         answer[0] = 1;
         for (int i = 1; i < length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
         }

         // Calculate the product of elements to the right of each element and multiply with the left product
         int right = 1;
         for (int i = length - 1; i >= 0; i--) {
            answer[i] = answer[i] * right;
            right *= nums[i];
         }

         return answer;
    }

    public static void main(String[] args) {
        ProductArray solution = new ProductArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);

        System.out.print("Output: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
