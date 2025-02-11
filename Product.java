// Overall Time Complexity : O(n) . The n time taken to traverse all the elements
// Overall Space Complexity : O(1) . There is no extra space taken for computation.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// Computing "left products" for each element, storing the product of all elements to the left.
// Computing "right products" for each element and multiplying by the previously computed left product.

public class Product {
public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    int rp =1; //left to right 
    for(int i =1 ;i<n;i++){
        rp *= nums[i-1];
        res[i] = rp;
    }
    rp =1; //right to left
    for(int i = n-2; i>=0;i--){
        rp*=nums[i+1];
        res[i] = rp * res[i];
    }
    return res;
}
}