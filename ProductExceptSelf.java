// Approach: Create a prefix product array where each element contains the product of all elements preceding it. Similarly, create a suffix
// product array. The product of elements at a given index in the prefix and suffix arrays gives the desired element at that index in the
// result array.
// Time Complexity: O(n) where n = array size
// Space Complexity: O(n)

// https://leetcode.com/problems/product-of-array-except-self/description/

import java.util.Arrays;

public class ProductExceptSelf {

    int[] bruteForce(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            for (int j = 0; j < n; j++){
                if (i != j) {
                    ans[i] *= arr[j];
                }
            }
        }
        return ans;
    }

    int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];

        prefixProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            prefixProduct[i] = prefixProduct[i - 1] * arr[i - 1];
        }

        suffixProduct[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffixProduct[i] = suffixProduct[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = prefixProduct[i] * suffixProduct[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        ProductExceptSelf pes = new ProductExceptSelf();
        int[] arr = { 1, 2, 3, 4 }; // yields output [24, 12, 8, 6]
        System.out.println(Arrays.toString(pes.productExceptSelf(arr)));
    }
}