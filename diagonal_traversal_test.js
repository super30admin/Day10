/**
 * @param {number[][]} mat
 * @return {number[]}
 */
var findDiagonalOrder = function (mat) {
  let rows = mat.length;
  let cols = mat[0].length;
  let result = new Array(rows * cols);
  let direction = true;
  let row = 0;
  let col = 0;
  for (let index = 0; index < rows * cols; index++) {
    result[index] = mat[row][col];
    if (direction == true) {
      if (col == cols - 1) {
        row++;
        direction = false;
      } else if (row == 0) {
        col++;
        direction = false;
      } else {
        row -= 1;
        col += 1;
      }
    } else {
      if (row == rows - 1) {
        col++;
        direction = true;
      } else if (col == 0) {
        row++;
        direction = true;
      } else {
        row++;
        col--;
      }
    }
  }
  return result;
};

test("Scenario #1: BaseCase", () => {
  let nums = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ];
  expect(findDiagonalOrder(nums)).toStrictEqual([1, 2, 4, 7, 5, 3, 6, 8, 9]);
});
