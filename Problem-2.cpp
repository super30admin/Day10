//Time Complexity = O(M*N)
//Space Complexity = O(1)
//Here the Time complexity is O(1) because the extra space (vector<int> ans) which we are using is the same which we are returning.
/*Question: Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:

[

[ 1, 2, 3 ],

[ 4, 5, 6 ],

[ 7, 8, 9 ]

]

Output: [1,2,4,7,5,3,6,8,9]
*/
class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int m=mat.size();
        int n=mat[0].size(),r=0,c=0,i=0,dir=1;
        vector<int> ans;
        while(i<m*n)
        {
            ans.push_back(mat[r][c]);
            if(dir)                                                     //when traversing bottom to top diagonally.
            {
                if(c==n-1)                                              //The order of if-else here matters a lot.
                {                                                       //when traversing bottom to top diagonally, at one point we reach the row=0, then we increment our coloumn by 1, at one time when coloumn becomes coloumn+1, we get out of bound. To manage this we have this order of if else.
                    r++;
                    dir=0;
                }
                else if(r==0){
                    c++;
                    dir=0;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else                                                         //when traversing top to bottom diagonally.
            {
                if(r==m-1){                                              //The order of if-else here matters a lot.
                    c++;                                                 //when traversing top to bottom diagonally, at one point we reach the coloumn=0, then we increment our row by 1, at one time when row becomes row+1, we get out of bound. To manage this we have this order of if else.
                    dir=1;
                }
                else if(c==0){
                    r++;
                    dir=1;
                }
                else{
                    r++;
                    c--;
                }
            }
            //ans.push_back(mat[r][c]);         we can't enter the matrix element into our ans vector here beacuse when we will be on last element of matrix our row or coloumn(one of these) will get out of bound as per our code.
            i++;
        }
        return ans;
    }
};
