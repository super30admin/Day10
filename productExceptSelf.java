// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes

// Three line explanation of solution in plain english
// The solution starts by iterating over the input array from left to right,
//  accumulating and storing the product of all previous elements at each index. 
// Then, it processes the array from right to left, updating each stored value by multiplying it with the accumulated product of all subsequent elements. 
// Finally, each position in the result array contains the product of all array elements except the one at the current index, achieved through the combination of previously calculated left and right products.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int res[] = new int [n];
        int rp=1;
        res[1]=rp;
        for(int i=0;i<n;i++){
            res[i]=rp;
            rp=rp*nums[i];
            System.out.println(rp);
        }
        rp=1;
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*rp;
            rp=rp*nums[i];
            System.out.println(rp);
        }
        return res;
    }
}