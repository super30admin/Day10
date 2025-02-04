public class ProductExceptSelf {
           public int[] productExceptSelf(int[] nums) {

            int n = nums.length;
            int[] answer = new int[n];

            // Step 1: Compute the left products
            answer[0] = 1;  // There's no element to the left of the first element
            for (int i = 1; i < n; i++) {
                answer[i] = answer[i - 1] * nums[i - 1];
            }

            // Step 2: Compute the right products and update the answer array
            int right = 1;  // There's no element to the right of the last element
            for (int i = n - 1; i >= 0; i--) {
                answer[i] = answer[i] * right;
                right *= nums[i];  // Update right to the product of elements to the right
            }

            return answer;
        }

    }

