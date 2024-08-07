// essentially take left of the array -> put it into result
// then take the right of the array -> put it into result.
// Time complexity = O(n)
// Space complexity = O(1) <- why? because the result array is not an auxiliary array.
// The auxiliary array is considered for the space complexity.

class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i< res.length;i++) {
            if(i==0) {
                res[i]=1;
            }
            else {
                res[i] = res[i-1]*nums[i-1];// left of i-1(which is res[i-1]) and the left of i (nums[i-1]).
            }
        }
        int rp = 1;
        for(int i=res.length-1;i>=0;i--) {
            if(i!= nums.length-1) {
                // pass
                rp =rp *nums[i+1];// right of i.// which is lp *nums[i+1]
                res[i] = res[i]*rp;// multiply it.
            }
        }
        return res;
    }
}