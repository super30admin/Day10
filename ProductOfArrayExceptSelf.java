/**
 L.C: 238

 Approach: Using running product for left side of an element and right side of an element

 Working:
     initialize runningProduct to 1, an resultant array of length of the input
     For left product, directly place the rProduct in the first index res[0];
     iterate the array from 1 to n, set rp = rp* nums[index-1], set rp value to res[i];
     set rp =1
     for right product, iterate through the array, n-2 ... 0,
         set rp = rp * nums[index+1]// right product
         set the product of left and right for current index to resultant array res[index]*rp
     return resultant array


 Time Complexity: O(n)
 Space Complexity: O(1) // Using only one 1d array of len if input array and returning the same from the function.
 */

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {


        int[] res = new int[nums.length];
        int rp=1;

        res[0] = rp;
        for(int i=1;i<res.length; i++) {
            rp = nums[i-1]*rp;
            res[i] = rp;
        }

        rp=1;
        for(int i = res.length-2;i>=0; i--) {
            rp = rp*nums[i+1];
            res[i] = res[i]*rp;
        }

        return res;
    }
}
