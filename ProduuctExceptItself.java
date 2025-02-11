class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] nums1=  new int[nums.length];
        int lp=1;
        int rp=1;
        nums1[0]=1;
        for(int i=1;i<nums.length;i++){
            lp*=nums[i-1];
            nums1[i]=lp;
        }
        for(int j=nums.length-2;j>=0;j--){
            rp*=nums[j+1];
            nums1[j]=nums1[j]*rp;



        }
        return nums1;
    }
}