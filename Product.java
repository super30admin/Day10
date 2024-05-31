//time complexity:O(n)
//space complexity:O(1)

public class Product {
        public int[] productExceptSelf(int[] nums)
        {
            if(nums==null || nums.length==0)
            {
                return new int[]{};
            }
            int n=nums.length;
            int[] prod=new int [n];
            int rp=1;
            prod[0]=rp;
            for(int i=1;i<n;i++)
            {
                rp=rp*nums[i-1];
                prod[i]=rp;
            }
            rp=1;
            for(int i=n-2; i>=0; i--)
            {
                rp=rp*nums[i+1];
                prod[i]=prod[i]*rp;
            }
            return prod;
        }
        public static void main(String[] args) {
            Product p=new Product();
            int[] nums={1,2,3,4};
            int[] result=p.productExceptSelf(nums);
            for(int i=0;i<nums.length;i++)
            {
                System.out.print(result[i]+ " ");
            }
        }
    }

