public class Solution
{
    public int[] ProductExceptSelf(int[] nums)
    {
        var result = new int[nums.Length];

        int leftProduct = 1, rightProduct = 1;
        for (int i = 0; i < nums.Length; i++)
        {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for (int i = nums.Length - 1; i >= 0; i--)
        {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}