/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (matrix) {
  let left = 0;
  let right = matrix[0].length - 1;
  let top = 0;
  let bottom = matrix.length - 1;

  let result = new Array();
  while (left <= right && top <= bottom) {
    // Left -> Right
    for (let col = left; col <= right; col++) {
      result.push(matrix[top][col]);
    }
    top++;

    // Top to bottom
    for (let row = top; row <= bottom; row++) {
      result.push(matrix[row][right]);
    }
    right--;

    // right -> Left
    if (top <= bottom) {
      for (let col = right; col >= left; col--) {
        result.push(matrix[bottom][col]);
      }
      bottom--;
    }

    // Bottom to top
    if (left <= right) {
      for (let row = bottom; row >= top; row--) {
        result.push(matrix[row][left]);
      }
      left++;
    }
  }

  return result;
};

test("Scenario #1: Happy Path", () => {
  let nums = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ];
  expect(spiralOrder(nums)).toStrictEqual([1, 2, 3, 6, 9, 8, 7, 4, 5]);
});

test("Scenario #2: Complex Success", () => {
  let nums = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
  ];
  expect(spiralOrder(nums)).toStrictEqual([
    1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7,
  ]);
});
