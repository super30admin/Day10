class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int[] p = new int[nums.length];
        int[] p1 = new int[nums.length];
        int[] p2 = new int[nums.length];
        p1[0]=p2[0]=1;
        p1[nums.length-1]= p2[nums.length-1]=1;
        
        for(int i=nums.length-2;i>=0;i--){
               prod=prod*nums[i+1];
               p2[i]=prod;
               
               
           }
           prod=1;
           for(int i=1;i<nums.length;i++){
               prod=prod*nums[i-1]; 
               p1[i]=prod;
               if(i==1)
                p[0]=p1[0]*p2[0];

               p[i]=p1[i]*p2[i];
               
               
           }
           
            
           return p;
    }
}