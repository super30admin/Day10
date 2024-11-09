// Time Complexity : o(n)
// Space Complexity : o(1) for answer array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : We calculate by taking product of running product
// with previous element and similary we do the same from right to left and will update the answer
// array from 1st iteration to the second iteration and return the array


public class problem1 {
    public int[] productExceptSelf(int[] nums) {
        int [] answer= new int[nums.length];
        int rp=1;
        answer[0]=rp;
        for (int i=1; i<nums.length; i++){
            rp=rp*nums[i-1];
            answer[i]=rp;
        }
        rp=1;
        for (int i=nums.length-2; i>=0; i--){
            rp=rp*nums[i];
            answer[i]*=rp;
        }
        return answer;
    }
}
