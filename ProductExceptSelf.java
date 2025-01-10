class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] sol = new int[nums.length];
        int rProduct = 1;
        sol[0] = rProduct;
        for(int i=1; i<nums.length; i++){
            rProduct = rProduct * nums[i-1];
            sol[i] = rProduct;
        }

        rProduct = 1;
        sol[nums.length - 1] = rProduct * sol[nums.length - 1];
        for(int i=nums.length - 2; i>=0; i--){
            rProduct = rProduct * nums[i+1];
            sol[i] = rProduct * sol[i];
        }

        return sol;
    }
}
