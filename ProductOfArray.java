// Time Complexity : O(n)
// Space Complexity : Auxillary O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
/*
Calculate the running product at every index
from left to right and vice versa
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]=new int[n];
        answer[0]=1;
        for(int i=1;i<nums.length;i++){
            answer[i]=answer[i-1]*nums[i-1];
        }

        int R=1;
        for(int i=n-1;i>=0;i--){
            answer[i]=R*answer[i];
            R=R*nums[i];
        }

        return answer;
    }
}