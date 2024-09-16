//Time Complexity = O(N)
//Space Complexity = O(N)
//Here the space complexity is O(N) because the function return type is vector and we are taking the extra space(vector<int> temp1,vector<int> temp2) but returning the vector<int> temp1.
/*Question: Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)*/
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int i,rp=1;
        vector<int> temp1(nums.size(),0);
        temp1[0] = rp;
        for(i=1;i<nums.size();i++)              //here we are traversing left to right, at particular index i am storing the product of all the elements to the left of it (excluding the element at that index).
        {
            rp*=nums[i-1];
            temp1[i] = rp;
        }
        rp=1;
        vector<int> temp2(nums.size(),0);       //here we are traversing right to left, at particular index i am storing the product of all the elements to the right of it (excluding the element at that index).
        temp2[nums.size()-1] = rp;
        for(i=nums.size()-2;i>=0;i--)
        {
            rp*=nums[i+1];
            temp2[i]=rp;
        }
        for(i=0;i<nums.size();i++) 
            temp1[i]=temp1[i]*temp2[i];
        return temp1;
    }
};


//Time Complexity = O(N)
//Space Complexity = O(1)
//Here the space complexity is O(1) because the function return type is vector and we are taking the extra space(vector<int> temp) but returning the vector<int> temp.
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int i,rp=1;
        vector<int> temp(nums.size(),0);
        temp[0] = rp;
        for(i=1;i<nums.size();i++)
        {
            rp*=nums[i-1];
            temp[i] = rp;
        }
        rp=1;
        for(i=nums.size()-2;i>=0;i--)
        {
            rp*=nums[i+1];
            temp[i]*=rp;
        }
        return temp;
    }
};
