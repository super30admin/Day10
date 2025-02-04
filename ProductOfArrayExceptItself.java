class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int leftToRightProduct=1;
        int n=nums.length;
        int res[] = new int[n];
        res[0]=leftToRightProduct;
        for(int i=1;i<n;i++)
        {
            leftToRightProduct*=nums[i-1];
            res[i]=leftToRightProduct;
        }
        int rightToLeftProduct=1;
        for(int i=n-2;i>=0;i--)
        {
            rightToLeftProduct*=nums[i+1];
            res[i]*=rightToLeftProduct;
        }
        return res;
    }
}

//tc :O(n) where n is the length of the array
//sc : O(1)