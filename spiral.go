// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
if length 0 return
base cases
if lowerindex is greater than upper index return
if only one element in recursive subarray return that element
if only 1 row remains in subarray add all elments of that array and return
if only 1 column remains in subarray add all elments of that array and return
else loop in all 4 directions and add all elements in outer ring
append it to result of recursive inner subarray call
*/

package main

import "fmt"

func spiralOrder(matrix [][]int) []int {
	if len(matrix) ==0 {
		return []int{}
	}
	x2:=len(matrix)-1
	y2:=len(matrix[0])-1
	return helper(matrix,0,0,x2,y2)
}

func helper(m [][]int,x1, y1,x2, y2 int) []int {
	if x1>x2 || y1>y2 {
		return []int{}
	} else if x1==x2 && y1==y2 {
		return []int{m[x1][y1]}
	} else if x1==x2 {
		result := []int{}
		for i:=y1;i<=y2;i++ {
			result = append(result, m[x1][i])
		}
		return result
	} else if y1==y2 {
		result := []int{}
		for i:=x1;i<=x2;i++ {
			result = append(result, m[i][y1])
		}
		return result
	} else {
		result := []int{}
		for i:=y1;i<y2;i++ {
			result = append(result, m[x1][i])
		}
		for i:=x1;i<x2;i++{
			result = append(result, m[i][y2])
		}
		for i:=y2;i>y1;i-- {
			result = append(result, m[x2][i])
		}
		for i:=x2;i>x1;i-- {
			result = append(result, m[i][y1])
		}
		return append(result, helper(m,x1+1,y1+1,x2-1,y2-1)...)
	}
}

func MainSpiral() {
	fmt.Println(spiralOrder([][]int{{1,2,3,4},{5,6,7,8},{9,10,11,12}})) //expected [1 2 3 4 8 12 11 10 9 5 6 7]
}
