//approach - g from left to right and make a running product and add those into the output arrt=ay
//take from left tot right//TC-O(n) + O(n) = O(2n) = O(n) -- aswe ignore the constant 
//SC- no auxiliary space used , we returned the output array, so it doesnt count and so SC - O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length ==0) return new int[]{};
        
        int rp =1; //running product
        int[] output = new int[nums.length];
        //nums - [2,3,4,5]
        //array * rp = [1,2,6,24]
        //output - [ 60 ,40,30, 25]
    
        //go from left to right on the input array
        output[0] = rp;//1st element as rp
        
        for(int i=0; i< nums.length-1; i++)
        {
            rp = rp * nums[i];
            output[i+1] =  rp;
        }
        //array after this for loop is  --
        //[1,2,6,24]
       
        //Go from right to left
        rp =1;
        for(int i = nums.length -1;  i>=0; i--)
        {
          output[i] = rp*output[i];
            rp = rp * nums[i];
        }
        //[60,40,30,24]
    return output;
        
    }
}