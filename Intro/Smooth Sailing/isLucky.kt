/*
Ticket numbers usually consist of an even number of digits.
 A ticket number is considered lucky if the sum of the first half of the digits
 is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[execution time limit] 3 seconds (kt)

[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.
 */

fun isLucky(n: Int): Boolean {
    var firstSum = 0
    var secondSum = 0
    var x = n.toString()
    var y = x.toMutableList()
    var z = y.size/2


    for (i in 0 until z)
        firstSum = firstSum + y[i].toInt()

    for (i in z until y.size)

        secondSum = secondSum + y[i].toInt()

    if( firstSum==secondSum) {
        return true
    } else {
        return false
    }
}
