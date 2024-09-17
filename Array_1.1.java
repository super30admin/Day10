//TIme Complexity: O(n)
//Space Complexity: O(1)

//Brute Force 
//Find the product of all elements by traversing once through the list and save in a variable.
//Now mutate the same list-  dividing the product by the current element and storing. 

class Solution {
    public int[] productExceptSelf(int[] nums) {
       if(nums.length == 0 || nums == null ) return new int[] {0};
        int n = nums.length;
        
        int left =1, right =1;
        int[] ans = new int[nums.length];
        ans[0]=1;
        
        for(int i =1;i<n;i++){
            ans[i] = left * nums[i-1];
            left = ans[i];
        }
        for(int i = n-1; i>=0;i--){
            ans[i] = right * ans[i];
            right *= nums[i];
        }
        return ans;
        
    }
}