// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

import java.util.Arrays;

// brute force TC - O(n^2) SC - n
// class Solution {
//     public int[] productExceptSelf(int[] nums) {

//         int[] answer = new int[nums.length];
        

//         for(int i =0; i < nums.length; i++){
//             int a=1;
//             for(int j =0; j< nums.length;j++){
//                if(j != i){
//                 a = a*nums[j];

//                }
//             }
//             answer[i] = a;
//         }
//         return answer;
        
//     }
// }

//optimized approach
//in one pass like in deiffrent array keep product of all elements to 
//the left of that index element.
//in second pass in diffrent array keep product 
//of all elements to the right of that index element
// Input: nums = [1,2,3,4]
// left pass [1,1,2,6]
// right pass [24,12,4,1]
// result - multiply both -[24, 12, 8, 6]
//then just use one array for left and right pass
//TC--O(3n). SC - O(2n) we do not include the output array
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;

//        int[] left = new int[n];
//        int[] right = new int[n];
//        int[] result = new int[n];

//        left[0] = 1;
//        right[n-1] = 1;

//        for(int i = 1; i<n; i++){
//         left[i] = left[i-1]*nums[i-1];
//        }

//        for(int i = n-2; i>=0; i--){
//         right[i] = right[i+1]*nums[i+1];
//        }

//         for(int i = 0; i<n; i++){
//         result[i] = left[i]*right[i];
//        }

//        return result;   
//     }
// }



//with one array only
// Input: nums = [1,2,3,4]
// left pass [1,1,2,6]
// right pass [24,12,4,1]
// result - multiply both -[24, 12, 8, 6]
// TC - O(2n) SC-O(1)
class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int[] result = new int[n];

       int rp = 1;
       result[0] = rp;

       for(int i = 1; i<n; i++){
        rp = nums[i-1] * rp;
        result[i] = rp;
       }
       rp = 1;
       for(int i = n-2; i>=0; i--){
        rp = nums[i+1] * rp;
        result[i] = result[i]*rp;
       }

       return result;   
    }

    public static void main (String[] args)

    {
    
        ProductofArrayExceptSelf p = new ProductofArrayExceptSelf();
    
     int[] arr = new int[]{1,2,3,4};
    
    
    
       int[] answer = p.productExceptSelf(arr);
       System.out.println(Arrays.toString(answer));
    
    }
}