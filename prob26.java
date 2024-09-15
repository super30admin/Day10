class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] lp = new int[N];
        int[] rp = new int[N];
    
    int [] op = new int [N];
    lp [0] = 1;
    rp [N-1] = 1;
    
    for( int i =1 ; i< N; i++){
        lp[i] = nums[i-1]*lp[i-1];
    }
    
    for( int i =N-2 ; i>=0; i--){
        rp[i] = nums[i+1]*rp[i+1];
        
    }
    for(int i=0; i< N; i++){
        op[i] = lp[i] * rp[i];
    }
    return op;
}
}

//TC: o(n)
//SC:o(n)
//Run in leetcode: Yes
