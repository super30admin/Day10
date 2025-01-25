/* Compute left half product and right half product for each index,
so the result will be product of elemnts to it's right * product of elements to it's left
T.C : 0(n)
S.C : O(1)
*/

class Product {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int lp = 1;
        int rp = 1;

        int[] res = new int[l];

        res[0] = 1;

        for(int i = 1; i<l; i++)
        {
            lp =  lp * nums[i-1];
            res[i] = lp;
        }

        for(int i = l-2;i>=0;i--)
        {
            rp = rp * nums[i+1];
            res[i] = res[i] * rp;
        }
        return res;
    }
}
