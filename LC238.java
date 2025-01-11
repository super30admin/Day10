// TC: O(n)
// SC: O(1), Since output array is not considered as extra space as mentioned in the problem statement

public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1, N = nums.length;
        int res[] = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = pro;
            pro *= nums[i];
        }
        pro = nums[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            res[i] *= pro;
            pro *= nums[i];
        }
        return res;
    }
}
