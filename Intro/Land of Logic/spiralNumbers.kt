/*
Construct a square matrix with a size N × N containing integers from 1 to N * N in a spiral order,
 starting from top-left and in clockwise direction.

Example

For n = 3, the output should be

spiralNumbers(n) = [[1, 2, 3],
                    [8, 9, 4],
                    [7, 6, 5]]
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer n

Matrix size, a positive integer.

Guaranteed constraints:
3 ≤ n ≤ 100.

[output] array.array.integer
 */
val spiralNumbers = { n: Int ->
    val s = List(n) { MutableList(n) { 0 } }
    var r = 0
    var c = 0
    var i = 0
    var j = 1
    for (k in 1 .. n*n) {
        s[r][c] = k
        if (c+j !in 0 .. n-1 || r+i !in 0 .. n-1 || s[r+i][c+j] != 0) {
            val t = j
            j = -i
            i = t
        }
        c += j
        r += i
    }
    s
}
