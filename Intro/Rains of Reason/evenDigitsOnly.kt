/*
Check if all digits of the given integer are even.

Example

For n = 248622, the output should be
evenDigitsOnly(n) = true;
For n = 642386, the output should be
evenDigitsOnly(n) = false.
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer n

Guaranteed constraints:
1 ≤ n ≤ 109.

[output] boolean

true if all digits of n are even, false otherwise.
 */
fun evenDigitsOnly(n: Int): Boolean {
    val X = "$n"

    X.asSequence().forEach {
        val digit = it.toString().toInt()
        if (digit % 2 == 1)
            return false
    }
    return true
}
