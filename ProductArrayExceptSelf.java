//Time complexity: O(n)
//Space complexity: O(1)
class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[]{};
        }

        int n = nums.length;
        int[] answer = new int[n];
        int rp = 1;
        answer[0] = rp;
        for(int i=1;i<n;i++){
            rp = rp * nums[i-1];
            answer[i] = rp;
        }

        rp = 1;
        for(int i = n-2;i>=0;i--){
            rp = rp * nums[i+1];
            answer[i] = answer[i] * rp;
        }
        return answer;
    }
}