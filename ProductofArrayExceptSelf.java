
// Time Complexity: O(n) as array is traversed, O(n) as two arrays are used.
// Space Complexity: O(n) as array is traversed, O(1) as only 1 array is used. 
import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelfUsingTwoArrays(new int[] { 1, 2, 3, 4 }))); // 24,12,8,6
        System.out.println(Arrays.toString(productExceptSelfUsingSingleArray(new int[] { 1, 2, 3, 4 }))); // 24,12,8,6
    }

    public static int[] productExceptSelfUsingTwoArrays(int[] nums) {
        int sumFromLeft[] = new int[nums.length];
        int sumFromRight[] = new int[nums.length];
        int leftSumProduct = 1;
        for (int i = 0; i < sumFromLeft.length; i++) {
            sumFromLeft[i] = leftSumProduct;
            leftSumProduct *= nums[i];
        }
        int rightSumProduct = 1;
        for (int i = sumFromRight.length - 1; i >= 0; i--) {
            sumFromRight[i] = rightSumProduct;
            rightSumProduct *= nums[i];
        }
        for (int i = 0; i < sumFromLeft.length; i++) {
            sumFromLeft[i] *= sumFromRight[i];
        }
        return sumFromLeft;
    }

    public static int[] productExceptSelfUsingSingleArray(int[] nums) {
        int sumFromLeft[] = new int[nums.length];
        int leftSumProduct = 1;
        for (int i = 0; i < sumFromLeft.length; i++) {
            sumFromLeft[i] = leftSumProduct;
            leftSumProduct *= nums[i];
        }
        int rightSumProduct = 1;
        for (int i = sumFromLeft.length - 1; i >= 0; i--) {
            sumFromLeft[i] = rightSumProduct * sumFromLeft[i];
            rightSumProduct *= nums[i];
        }
        return sumFromLeft;
    }
}