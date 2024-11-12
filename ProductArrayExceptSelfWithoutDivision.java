/*
 Time Complexity: O(2n) two pass, one to find the left product and other to find the right product along with
                  updating the result

Space Complexity: O(1) no extra space used, the space used for result array will be returned as output which we do not
                  consider as input and output remains same.

Did this code successfully run on Leetcode : yes

    This approach was explained in class
 */
class ProductArrayExceptSelfWithoutDivision {
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] result = new int[n];

        //left product
        int rp = 1; //runningProduct
        result[0] = rp;

        /*
        rp = rp*nums[i-1]

            [2,     4,      6,             1]
        RP=> 1, (1*2 = 2), (2*4 = 8), (8*6=48)
        */
        for(int i = 1; i < n; i++)
        {
            rp = rp*nums[i-1];
            result[i] = rp; //left products added in result
        }

        //right product
        rp = 1;
        for(int i = nums.length-2; i>=0; i--) //-2 as last value won't change
        {
            rp = rp*nums[i+1];
            result[i] = result[i] * rp;
        }

        return result;
    }
}