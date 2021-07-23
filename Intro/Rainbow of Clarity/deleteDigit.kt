/*
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.

Example

For n = 152, the output should be
deleteDigit(n) = 52;
For n = 1001, the output should be
deleteDigit(n) = 101.
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer n

Guaranteed constraints:
10 ≤ n ≤ 106.

[output] integer
 */
fun deleteDigit(n: Int): Int {
    val str = n.toString()
    var max = 0
    for (i in 0 until str.length) {
        val newStr = str.removeRange(i, i + 1)
        val newN = newStr.toInt()
        if (newN > max) {
            max = newN
        }
    }
    return max
}
