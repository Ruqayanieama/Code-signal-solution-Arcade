/*
Let's define digit degree of some positive integer as the number of times we need to replace

 this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.

Example

For n = 5, the output should be
digitDegree(n) = 0;
For n = 100, the output should be
digitDegree(n) = 1.
1 + 0 + 0 = 1.
For n = 91, the output should be
digitDegree(n) = 2.
9 + 1 = 10 -> 1 + 0 = 1.
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer n

Guaranteed constraints:
5 ≤ n ≤ 109.

[output] integer
 */
fun digitDegree(n: Int): Int {
    var n = n
    return if (n < 10) 0 else {
        var i: Int
        i = 0
        while (n >= 10) {
            var x = 0
            val y = n.toString()
            for (j in 0 until y.length) {
                x += y[j].toString().toInt()
            }
            n = x
            i++
        }
        i
    }
}
