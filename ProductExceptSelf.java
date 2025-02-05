// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/*
Logic is for any element take product of all elements on left and take products of all elements on right.
We can use a new array to calculate product of all elements to the left of an index. In another loop, we can calculate product of right elements,
store in a variable. So, for any element, product except self is product of this variable and element on left index in the new array.
return the new array.
*/

public class ProductExceptSelf {
    public int[] findProductExceptSelf(int[] nums) {
        
        int len=nums.length;
        int[] arr=new int[len];
        arr[0]=1;
        for(int i=1;i<len;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        int i=len-1;
        int right=1;
        while(i>=0 ){
            if(i!=0){
               arr[i]=arr[i]*right; 
            }else{
               arr[i]=1*right; 
            }
            right=right*nums[i];
            i--;
        }
        return arr;
    }
}
