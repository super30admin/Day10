namespace LeetCodeSubmission.Arrays1;

public class ProductOfAnArrayExceptSelf
{
    public int[] ProductExceptSelf(int[] nums)
    {
        int[] result = new int[nums.Length];
        
        // perform product from lhs-to-rhs side
        for (int i = 0; i < nums.Length; i++)
        {
            if (i == 0)
            {
                result[i] = 1;
                continue;
            }

            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // perform product from rhs-to-lhs side
        int rhsProd = 1;
        for (int i = nums.Length - 1; i > -1; i--)
        {
            result[i] = result[i] * rhsProd;
            rhsProd = rhsProd * nums[i];
        }

        return result;
    }
}