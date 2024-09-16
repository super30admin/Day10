// Time Complexity : o(m*n)
// Space Complexity : o(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english - use array bounds and visited array to change directions to up,down,left,right

// Your code here along with comments explaining your approach

/**https://leetcode.com/problems/spiral-matrix/
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
Example 2:

Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 *
 */

import java.util.LinkedList;
import java.util.List;

class Solution {

	//O(1) space solution by maintaining 4 boundaries
	public List<Integer> spiralOrderSpaceEfficient(int[][] matrix) {

		List<Integer> res = new LinkedList<>();

		if(matrix==null || matrix.length==0) return res;

		int m = matrix.length, n = matrix[0].length;

		int top = 0, bottom = m -1, left = 0, right = n-1;


		while(left <= right && top <= bottom) {
			for( int i = left; i <= right; i++)
				res.add(matrix[top][i]);
			top++;

			if(left <= right && top <= bottom) {
				for(int i=top; i<= bottom; i++)
					res.add(matrix[i][right]);
				right--; 
			}

			if(left <= right && top <= bottom) {
				for(int i=right; i >= left ; i--) 
					res.add(matrix[bottom][i]);
				bottom--;
			}

			if(left <= right && top <= bottom) {
				for(int i= bottom; i >= top; i--) 
					res.add(matrix[i][left]);
				left++;
			}

		}
		return res;
	}

	//O(m*n) space solution by maintaining 4 directions and visited[i][j] array
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> res = new LinkedList<>();

		if(matrix==null || matrix.length==0) return res;

		int m = matrix.length, n = matrix[0].length;

		boolean[][] visited = new boolean[m][n];
		boolean up=false,down=false,left=false,right=true;
		int cnt=0;

		int i=0, j=0;
		res.add(matrix[0][0]); cnt++; visited[0][0] = true;

		while(cnt < m*n) {
			if(right) {
				if(j+1 < n && !visited[i][j+1]) {
					j = j + 1;
				} else {
					down=true; right=false; left=false; up=false;
					i = i + 1;
				}
			} else if(down) {

				if(i+1 < m && !visited[i+1][j]) {
					i=i+1;
				} else {
					down=false; left=true; right=false;up=false;
					j = j-1;
				}
			} else if(left) {
				if(j-1 >=0 && !visited[i][j-1]){
					j=j-1;
				}else {
					up=true;down=false;left=false;right=false;
					i = i-1;
				}

			}else if(up) {
				if(i-1>=0 && !visited[i-1][j]){
					i=i-1;
				}else{
					up=false;right=true;left=false;down=false;
					j=j+1;
				}
			}

			res.add(matrix[i][j]);
			visited[i][j] = true;
			cnt++;
		}

		return res;
	}

}