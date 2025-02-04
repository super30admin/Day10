// Time Complexity :O(n^2) -> O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : it run perfectly,while submit i got time limit exceeded error
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach: i just did a bruete force approach by taking two loops if i == j then i should not consider that because we should calculate product except itself.
// so i took it from not matching indices it,but here the approach is to calculte it in O(n) time complexity.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){ // O(n)
            result[i]=1;
            for(int j=0;j<nums.length;j++){//O(n)
                if(i != j ){
                result[i] =result[i] * nums[j];
                }
            }
        }
        return result;
    }
}



// Time Complexity :O(3n) -> O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach:here i caculte running product from left to right in one array and right to left in another array finally i multiplied those two arrays in O(n) time and space complexity.
class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int[] result=new int[n];
       int[] result1=new int[n];
       result[0]=1;
       int rp=1;
      for(int i=1;i<n;i++){
        rp *=nums[i-1];
        result[i] = rp;
      }
       result1[n-1]=1;
       rp=1;
        for(int j=n-2;j>=0;j--){
            rp*=nums[j+1];
        result1[j]  = rp;
      }
      for(int i=0;i<n;i++){
        result[i] = result[i] * result1[i];
      }
      return result;
    }
}

// Time Complexity :O(2n) -> O(n)
// Space Complexity :O(1)-> O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach:here i caculte running product from left to right in one array and right to left in another array finally i multiplied those two arrays in O(n) time and space complexity.

class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int[] result=new int[n];
       int[] result1=new int[n];
       result[0]=1;
      int rp=1;
      for(int i=1;i<n;i++){
        rp*=nums[i-1];
        result[i] = rp;
      }
      rp=1;
        for(int j=n-2;j>=0;j--){
            rp *= nums[j+1];
        result[j]  *= rp;
      }
     
      return result;
    }
}