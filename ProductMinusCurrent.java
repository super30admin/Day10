// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes

/*
 * find running product of left side of index and then find the running product of right side of the index and finally
 * multiply both the running products to get answer.
 * we traverse from the end of the array to the beginning, while trying to get the right side running product of the array
 */
public class ProductMinusCurrent {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int runsum = 1;
        result[0] =1;
        for(int i= 0;i<n;i++){
            result[i] = runsum;
            runsum = runsum*nums[i];
        }
        int endsum=1;
        for(int j =n-1;j>=0;j--){
            result[j] = result[j]*endsum;
            endsum = endsum*nums[j];
        }
        
        return result;
    }
}
