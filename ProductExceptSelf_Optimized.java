
import java.util.Arrays;

public class ProductExceptSelf_Optimized {
    public int[] productExceptSelf(int[] nums)
    {
        int len = nums.length;
        int[] left = new int[len];

        left[0] = 1;
        //filling left array
        for(int i=1; i<len; i++)
        {
            left[i] = left[i-1]* nums[i-1];
        }

        int right =1;

        for(int i = len-1; i>=0; i--)
        {
            left[i] = left[i] * right;
//            System.out.println("right:  "+right);
            right = right * nums[i];
//            System.out.println("right: "+right + " nums: "+nums[i]);
        }

        return  left;
    }

}
class Main1
{
    public static void main(String[] args) {
        int[] nums = {4,1,3,2,1,1};
        ProductExceptSelf_Optimized p = new ProductExceptSelf_Optimized();
        int[] arr = p.productExceptSelf(nums);

        System.out.println("New Array is: "+ Arrays.toString(arr));

    }
}

/*
* Approach:
*
* creating a left array and traversing nums array and putting multilie value into the left array.
* Now, maintain a right variable as 1. and start multipying it with left
*
* Time Complexity: O(N)
* Space:O(1) returning the left array as result, so, no auxiliary space used unless right variable, which we can consider as constant.
*
* */