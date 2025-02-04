//TC: O(n)
//SC: Auxiliary O(1)
//Did it run on leetcode: Yes
public class Solution_ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int leftprod = 1;
        result[0] = leftprod;
        for(int i = 1; i < n; i++){
            leftprod = leftprod*nums[i-1];
            result[i] = leftprod;
        }
        int rightprod = 1;
        for(int i = n-2; i >= 0; i--){
            rightprod = rightprod*nums[i+1];
            result[i] = result[i]*rightprod;
        }
        return result;
    }
}
