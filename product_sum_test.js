const { run } = require("jest");

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function (nums) {
  let runningSum = 1;
  let array = new Array(nums.length);
  array[0] = runningSum;

  // Here at each index we will have product of all the left element except itself.
  for (let idx = 1; idx < nums.length; idx++) {
    runningSum = runningSum * nums[idx - 1];
    array[idx] = runningSum;
  }

  runningSum = 1;
  // Here at each index we will have product of all the right element except itself
  // since the answer is multiplication of left and right element except self. 
  // In 2nd line, we are basically multiplying left product and right product for the index. 
  for (let idx = nums.length - 2; idx >= 0; idx--) {
    runningSum = runningSum * nums[idx + 1];
    array[idx] = array[idx] * runningSum;
  }
  return array;
};
// Thought Process
// Divide the problem in 2 half

test("Scenario #1: BaseCase", () => {
  let nums = [1,2,3,4];
  expect(productExceptSelf(nums)).toStrictEqual([24, 12, 8, 6]);
});
