/*
Given a rectangular matrix containing only digits, calculate the number of different 2 × 2 squares in it.

Example

For

matrix = [[1, 2, 1],
          [2, 2, 2],
          [2, 2, 2],
          [1, 2, 3],
          [2, 2, 1]]
the output should be
differentSquares(matrix) = 6.

Here are all 6 different 2 × 2 squares:

1 2
2 2
2 1
2 2
2 2
2 2
2 2
1 2
2 2
2 3
2 3
2 1
Input/Output

[execution time limit] 3 seconds (kt)

[input] array.array.integer matrix

Guaranteed constraints:
1 ≤ matrix.length ≤ 100,
1 ≤ matrix[i].length ≤ 100,
0 ≤ matrix[i][j] ≤ 9.

[output] integer

The number of different 2 × 2 squares in matrix.
 */
fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    val set: MutableSet<List<Int>> = HashSet()
    for (x in 0 until matrix[0].size - 1) {
        for (y in 0 until matrix.size - 1) {
            set.add(arrayOf(matrix[y][x], matrix[y][x+1], matrix[y+1][x], matrix[y+1][x+1]).asList())
        }
    }
    return set.size
}
