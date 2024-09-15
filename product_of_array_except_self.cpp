// Time Complexity : O(n)  ... n is number of elements in array           
// Space Complexity : O(m) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/product-of-array-except-self/

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/

/*
Approach 1 :
// Time Complexity : O(3n) == O(n)  ... n is number of elements in array           
// Space Complexity : O(3n) == O(n) 

running product is used.
leftProduct stores the running product on left side of each element.
if          nums = [2, 3, 4, 5]
then leftProduct = [1, 2, 6, 24]
                    |  |
                    |  |--> on left side of 2 there is only one number i.e. 1, so product is 
                    |
                    |-----> there is no number on left side of 2; therefore default value is kept 1

similarly, rightProduct = [60, 20, 5, 1]

Now, the product between leftProduct and righProduct elements gives the final answer.
result = [1*60, 2*20, 6*5, 24*1]
       = [60, 40, 30, 24]
*/


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int rProd = 1;
        vector<int>leftProduct(nums.size(), 0);
        vector<int>rightProduct(nums.size(), 0);
        vector<int>result(nums.size(), 0);

        leftProduct[0] = 1;
        for(int i = 1; i<nums.size(); i++){    // O(n)
            rProd *= nums[i-1];
            leftProduct[i] = rProd;
        }

        rProd = 1;
        rightProduct[nums.size()-1] = 1;
        for(int j=nums.size()-2; j>=0; j--){     // O(n)
            rProd *= nums[j+1];
            rightProduct[j] = rProd;
        }

        for(int i=0; i<nums.size(); i++){       // O(n)
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;

    }
};




/*
Approach 2 :
// Time Complexity :  O(2n) == O(n) ... n is number of elements in array           
// Space Complexity : O(n) == O(n) 

Above logic can be implemented using just one array
*/


class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int rProd = 1;
        vector<int>result(nums.size(), 0);

        result[0] = 1;
        for(int i=1; i<nums.size(); i++){      // O(n)
            rProd *= nums[i-1];
            result[i] = rProd;
        }

        rProd = 1;
        for(int i=nums.size()-2; i>=0; i--){     // O(n)
            rProd *= nums[i+1];
            result[i] = result[i] * rProd;
        }

        return result;
    }
};