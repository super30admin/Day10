//Brute force
int[] arr = {1, 2, 3, 4};                                               //Time = O(n^2)
int[] result = new int[arr.length];                                     //Space = O(n)

for (int i = 0; i < arr.length; i++) {
    int product = 1;
    for (int j = 0; j < arr.length; j++) {
        if (j != i) {
            product *= arr[j];
        }
    }
    result[i] = product;
}

System.out.println(Arrays.toString(result)); // prints [24, 12, 8, 6]





//Improved.  Time, space = O(n)

class Solution{
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] output = new int[n];
    output[0] = 1;
    
    // Calculate prefix products
    for (int i = 1; i < n; i++) {
        output[i] = output[i-1] * nums[i-1];
    }
    
    // Calculate suffix products and multiply with prefix products
    int suffix = 1;
    for (int i = n-1; i >= 0; i--) {
        output[i] *= suffix;
        suffix *= nums[i];
    }
    
    return output;
  }
}
