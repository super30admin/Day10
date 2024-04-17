// Time Complexity : O(2N) ~ O(N) - N is the length of input array
// Space Complexity : O(1) - As the input and output array are not considered in the space complexity
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : We maintain a product array initially by calculating left running product and then we traverse from right part of the array and calculate the result by multiplying right running product with the elements in product array to get the resultant array
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int productArray[] = new int[n];
        int leftRunningProduct = 1;
        productArray[0] = leftRunningProduct;
        for(int i=1; i<n; i++) {
            leftRunningProduct = leftRunningProduct * nums[i-1];
            productArray[i] = leftRunningProduct;
        } 

        int rightRunningProduct = 1;
        for(int i=n-2;i>=0;i--) {
            rightRunningProduct = rightRunningProduct * nums[i+1];
            productArray[i] = rightRunningProduct * productArray[i];
        } 
        return productArray;  
    
    }
}