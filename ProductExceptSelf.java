public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int[] result2=new int[nums.length];
        result2[0]=1;
        int[] result1=new int[nums.length];
        result1[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            result2[i]=nums[i-1]*result2[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            result1[i]=nums[i+1]*result1[i+1];
        }
        for(int i=0;i<nums.length;i++){
            result[i]=result1[i]*result2[i];
        }
        return result;
    }

}
