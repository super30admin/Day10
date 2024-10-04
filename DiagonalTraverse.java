// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach



    // brute force approach
//travese array and store these details in hashmap 
//when sum of i j is 0 then 0: (0,0) i.e. 1
// when sum is 1 : (0,1), (1,0) i.e. 2, 4
// sum is 2: (0,2),(2,2),(2,0) i.e. 3,5,7
// sum is 3:(1,2), (2,1) -- 6,8
// sum is 4: (2,2)- 9
// then store data from this hashset to a array when sum is even same direction 
// and sum odd reverse direction
//TC-(2n*m) sc- hashset and 1 mn


//optimized approach we will check edge cases then store value in result
import java.util.Arrays;

public class DiagonalTraverse{

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int r=0, c=0;

        int[] result = new int[m*n];
        boolean updir = true;

        for(int i =0; i<m*n; i++){
             result[i] = mat[r][c];

             if(updir){// going upward checking edge cases
                if(r==0 && c!= n-1){
                    c++; updir = false;

                }else if(c==n-1){
                    r++; updir = false;

                }else{// normal case 
                    r--; c++;
                }
             }
             else{ //going down checking edge cases
                if(c==0 && r!=m-1){
                    r++; updir = true;
                }else if(r==m-1){
                    c++; updir = true;
                }else{// normal case 
                    r++; c--;
                }
             }
            
        }

        return result;
    }

    public static void main (String[] args)

    {
    
        DiagonalTraverse p = new DiagonalTraverse();
    
        int[][] arr = new int[][]{{2,3,1},{3,5,3},{7,100,101},{3,400,500}};
    
    
    
       int[] answer = p.findDiagonalOrder(arr);
       System.out.println(Arrays.toString(answer));
    
    }

}
