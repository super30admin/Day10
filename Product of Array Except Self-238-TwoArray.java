class Solution {
    // Running Sum/ Product Type
    public int[] productExceptSelf(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return new int[]{};
        }

    int[] leftArray = new int[nums.length];
    int[] rightArray = new int[nums.length];
    // leftArray[0] = 1;
    // rightArray[nums.length-1] = 1;
    int leftProduct = 1;
    int rightProduct = 1; 
    for(int i=0;i<nums.length;i++)
    {
          leftArray[i] = leftProduct;
          leftProduct*= nums[i];
    }

    for(int i=rightArray.length-1;i>=0;i--)
    {
        rightArray[i] = rightProduct;
        rightProduct*=nums[i];
    }

    int[] result = new int[nums.length];
    for(int i=0;i<result.length;i++)
    {
        result[i] = leftArray[i] * rightArray[i];
    } 

    return result;       
    }
}
