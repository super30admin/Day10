//Time Complexity:O(n)
//Space Complexity:O(n)
import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productSelf(int[] nums){
        int n=nums.length;
        int[] result=new int[n];
        int rp=1;
        result[0]=1;
        for(int i=1;i<n;i++){
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--){
            rp=rp*nums[i+1];
            result[i]=result[i]*rp;
        }
        return result;
    }
    public static void main(String[] args) {
        ProductExceptSelf m=new ProductExceptSelf();
        int[] nums={-1,1,0,-3,3};
        int[] result=m.productSelf(nums);
        System.out.println(Arrays.toString(result));

    }
}