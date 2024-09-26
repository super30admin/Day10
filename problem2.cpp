# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        vector<int>res;
  if(!mat.size() or !mat[0].size())return res;
  int f=1,i=0,j=0,m=mat.size(),n=mat[0].size();   //  if f=1 moving up else moving down
  while(i<m and j<n)
  {
      res.push_back(mat[i][j]);
      if(i==m-1 and j==n-1)break;
      if(f)
      {
         if(i>0 and j<n-1)
         {
             i--;
             j++;
         }
          else
          {
              f=0;                 //changing the state(f) to move down
              if(j==n-1)
              {
                  i++;
              }
              else
              {
                  j++;
              }
          }
      }
      else
      {
          if(j>0 and i<m-1)
         {
             i++;
             j--;
         }
          else
          {
              f=1;                    //changing the state(f) to move up
              if(i==m-1)
              {
                  j++;
              }
              else
              {
                  i++;
              }
          }
      }
  }
  return res;
    }
};