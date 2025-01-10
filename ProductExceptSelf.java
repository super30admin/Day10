public class ProductExceptSelf {
    
    public int[] productExceptSelf(int[] num){
        //Time complexity: O(n)
        //Space complexity: O(1)
        int res[] = new int[num.length];

        int sum =1;

        for (int i = 0; i < num.length; i++){
            res[i] = sum;
            sum = num[i] * sum;
        }

        sum = 1;

        for (int i = num.length-1; i>= 0; i--){
            res[i] = res[i]*sum;
            sum = sum * num[i];
        }
    return res;
    }
}
