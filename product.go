// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
have one result array
loop through once and set i = 0 to 1 and all the rest to multiplication till prev element
reset and loop again in reverse order and if i=n-1 multiply same result array by 1 else multiply with i+1th element
return result
*/
package main

import "fmt"

func productExceptSelf(nums []int) []int {
	n := len(nums)
	if n == 0 {
		return []int{}
	}
	res := make([]int, n)

	init := 1
	for i := 0; i < n; i++ {
		if i == 0 {
			res[i] = init
		} else {
			init *= nums[i - 1]
			res[i] = init
		}
	}
	init = 1
	for i := n-1; i >= 0; i-- {
		if i == n-1 {
			res[i] *= init
		} else {
			init *= nums[i + 1]
			res[i] *= init
		}
	}
	return res
}

func MainProduct() {
	fmt.Println(productExceptSelf([]int {1,2,3,4})) // expected [24,12,8,6]
}
