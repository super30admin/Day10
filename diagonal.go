// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
according to direction
store current element
if element is at the corner of array increase opposite of i or j and change direction
else if just reached edge and not corner increment opposite i or j and change dir
else decrement i or j and increment opposite i or j
do this for both directions
return
*/
package main

import "fmt"

func findDiagonalOrder(matrix [][]int) []int {
	m := len(matrix)
	if m == 0 {
		return []int{}
	}
	n := len(matrix[0])
	if n == 0 {
		return []int{}
	}
	res := make([]int, m*n)
	dir := 1
	i, j, ind := 0,0,0
	for ind < m*n {
		res[ind] = matrix[i][j]
		if dir == 1 {
			if j == n - 1 {
				i++
				dir = -1
			} else if i == 0 {
				j++
				dir = -1
			} else {
				i--
				j++
			}
		} else {
			if i == m - 1 {
				j++
				dir = 1
			} else if j == 0 {
				i++
				dir = 1
			} else {
				i++
				j--
			}
		}
		ind++
	}
	return res
}

func MainDiagonal() {
	fmt.Println(findDiagonalOrder([][]int{{ 1, 2, 3 },{ 4, 5, 6 }, { 7, 8, 9 }})) //expected:  [1,2,4,7,5,3,6,8,9]
}
