// Time Complexity : O(n) --> We iterate throught the entire array once
// Space Complexity : O(1) --> Only using the output array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Reducing space complexity from O(n) to O(1)


// Your code here along with comments explaining your approach

/*
1. Create a temporary pointer that checks for all the values to left of the original array.  
2. After appending the left hand side product, iterate from end to beginning updating the values for right hand side products
*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& arr) {
      
        int vectorSize = arr.size();
        vector<int> answer(vectorSize);
        
        int temp = 1;
        
  
        for(int i = 0; i < vectorSize; i++)
        {
            answer[i] = temp;
            temp *= arr[i];
        }
        
		temp = 1;
     
        for(int i = vectorSize - 1;  i >= 0; i-- )
        {
            answer[i] = answer[i] * temp;
            temp *= arr[i];
        }
        

		return answer;

	}
    
};