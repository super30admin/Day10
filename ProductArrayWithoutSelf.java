// Time Complexity :O(n) n is number of elements in array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes

public class ProductArrayWithoutSelf {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] result = new int[n];

        int prod=1;
        result[0]=1;
        //left product
        for(int i=1; i<n; i++){
            prod = prod * nums[i-1];
            result[i]= prod;
        }

        prod = 1;
        //right product
        for(int i=n-2; i>n; i--){
            prod = prod *nums[i+1];
            result[i]= result[i] * prod;
        }

        return result;
    }

    public static void main(String args[]) {
        ProductArrayWithoutSelf prod = new ProductArrayWithoutSelf();
        int[] nums = {1,2,3,4};
        System.out.println("Output "+prod.productExceptSelf(nums));

    }
}
