// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//TIME complexity O(m*n)
//SPACE complexity  O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spiral = new ArrayList<Integer>();
        int top = 0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;

        while (top<=bottom && left <= right) {
            for (int i=left;i<=right;i++) {
                System.out.println(matrix[top][i]);
                spiral.add(matrix[top][i]);
            }
            top++;

            for (int i=top;i<=bottom;i++) {
                System.out.println(matrix[i][right]);
                spiral.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i=right;i>=left;i--) {
                    System.out.println(matrix[bottom][i]);
                    spiral.add(matrix[bottom][i]);
                }
            }

            bottom--;
            if (left <= right) {
                for (int i=bottom;i>=top;i--) {
                    spiral.add(matrix[i][left]);
                }
            }

            left++;
        }
        return spiral;

    }
}


//TIME complexity O(n)
//SPACE complexity O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        if (nums.length == 0) {
            return new int[]{};
        }
        int rp= 1;
        result[0] = rp;
        for (int i=1;i<nums.length;i++) {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp=1;

        for (int i=nums.length-2;i>=0;i--) {
            rp = rp*nums[i+1];
            result[i] = result[i] * rp ;

        }

        return result;
    }
}
